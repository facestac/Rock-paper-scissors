package com.github.facestac.IOStream;

import com.github.facestac.player.Player;

import java.util.List;

public interface InputOutputStream {
    void saveData(List<Player> obj);

    List<Player> loadData();
}
