package com.apiipa.apiipa.Service;

import com.apiipa.apiipa.Repository.ApisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ApisService")
public class ApisServiceImpl implements ApisService {

    @Autowired
    ApisRepository repository;

    public String getApis() {
        return repository.getApis();
    }
}

