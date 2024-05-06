package com.github.facestac.dataStorage.jsonStorage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.github.facestac.dataStorage.DataStorage;
import com.github.facestac.leaderboard.Leaderboard;
import com.github.facestac.player.Player;
import com.github.facestac.player.PlayerView;
import com.github.facestac.player.playerService.PlayerService;
import com.github.facestac.player.playerService.PlayerServiceImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonStorage  {

    private final File file;
    private static final ObjectMapper mapper = new ObjectMapper();
    private List<PlayerView> listTopPlayers = new ArrayList<>();
    private final PlayerService playerService = new PlayerServiceImpl();


    public JsonStorage() {
        file = new File("storage.json");
//        listTopPlayers = loadData();
    }

    public List<PlayerView> loadData() {
////        if (listTopPlayers.isEmpty()) return null;
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader);
//            String jsonString = reader.readLine();
//            System.out.println(jsonString);
//            TypeFactory typeFactory = mapper.getTypeFactory();
//            listTopPlayers = mapper.readValue(jsonString,
//                    typeFactory.constructCollectionType(List.class, PlayerView.class));
////            System.out.println(someClassList);
//            reader.close();
//        } catch (IOException e){
//            e.getStackTrace();
//        }
//
        return listTopPlayers;
    }

    public void saveData(Object data) {

    }

//    @Override
//    public void saveData(T data) {
//
//    }

//    public void updateData(List<Player> players) {
//        if (listTopPlayers.isEmpty()) {
//            saveData(players);
//        } else {
//            playerService.updatePlayerListFromPlayerViewList(players, listTopPlayers);
//        }
//    }

    public void saveData() {
//        try {
//            listTopPlayers = playerService.convertPlayerListToPlayerViewList(players);
//            mapper.writeValue(file, listTopPlayers);
//        } catch (IOException e){
//            e.getStackTrace();
//        }
    }



//            FileReader fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader);
//            String jsonStr = reader.readLine();
//
////            JsonNode node = mapper.readTree(jsonStr);
////            System.out.println(node);
////            System.out.println(node.get(0));
////            System.out.println(node.get(0).get("id"));
////            List<Player> obj = mapper.readValue(jsonStr, new TypeReference<List<Player>>() {
////            });
////            System.out.println(obj);
////            reader.close();
//            List<Player> players = mapper.readValue(jsonStr, new TypeReference<List<Player>>(){});
//            System.out.println(players);


}
