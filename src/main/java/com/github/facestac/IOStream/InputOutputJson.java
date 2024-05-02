package com.github.facestac.IOStream;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.facestac.models.Player;

import java.io.*;
import java.util.List;


public class InputOutputJson implements InputOutputStream{
    private final File file;
    private static final ObjectMapper mapper = new ObjectMapper();

    public InputOutputJson() {
        this("storage.json");
    }

    public InputOutputJson(String fileName) {
        this.file = new File(fileName);
    }

    @Override
    public void saveData(List<Player> obj) {
        try {
//            mapper./*writerWithDefaultPrettyPrinter().*/writeValue(file, obj.get(0));;
            mapper.writeValue(file, obj);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public List<Player> loadData(){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String jsonStr = reader.readLine();

//            JsonNode node = mapper.readTree(jsonStr);
//            System.out.println(node);
//            System.out.println(node.get(0));
//            System.out.println(node.get(0).get("id"));
//            List<Player> obj = mapper.readValue(jsonStr, new TypeReference<List<Player>>() {
//            });
//            System.out.println(obj);
//            reader.close();
//            System.out.println("11111");
            List<Player> players = mapper.readValue(jsonStr, new TypeReference<List<Player>>(){});
            System.out.println(players);
//            System.out.println("22222");
            return null;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return null;
    }
}
