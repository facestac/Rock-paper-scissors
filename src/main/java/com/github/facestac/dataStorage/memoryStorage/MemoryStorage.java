package com.github.facestac.dataStorage.memoryStorage;

import com.github.facestac.dataStorage.DataStorage;
import com.github.facestac.player.PlayerView;

import java.util.ArrayList;
import java.util.List;

public class MemoryStorage implements DataStorage {
    private List<PlayerView> data = new ArrayList<>();

    public List<PlayerView> getData() {
        return data;
    }

    public void setData(List<PlayerView> data) {
        this.data = data;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

}
