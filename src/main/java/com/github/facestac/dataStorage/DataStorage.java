package com.github.facestac.dataStorage;

import com.github.facestac.player.PlayerView;

import java.util.List;

public interface DataStorage {
    List<PlayerView> getData();

    void setData(List<PlayerView> data);

    boolean isEmpty();
}
