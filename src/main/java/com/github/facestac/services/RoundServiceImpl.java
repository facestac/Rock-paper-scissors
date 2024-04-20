package com.github.facestac.services;

import com.github.facestac.repositories.RoundRepository;
import com.github.facestac.repositories.RoundRepositoryImpl;

public class RoundServiceImpl implements RoundService {

    private final RoundRepository roundRepository;

    public RoundServiceImpl() {this.roundRepository = RoundRepositoryImpl.getInstance();}
}
