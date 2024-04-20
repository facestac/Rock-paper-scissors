package com.github.facestac.repositories;

import com.github.facestac.entities.Round;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRepositoryImpl implements RoundRepository {

    private static RoundRepositoryImpl instance;
    private final Map<Integer, Round> rounds;
    private final AtomicInteger idSequence;

    private RoundRepositoryImpl() {
        this.rounds = new HashMap<>();
        this.idSequence = new AtomicInteger(1);
    }

    public static synchronized RoundRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new RoundRepositoryImpl();
        }
        return instance;
    }
}
