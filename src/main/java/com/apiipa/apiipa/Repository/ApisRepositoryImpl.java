package com.apiipa.apiipa.Repository;

import org.springframework.stereotype.Service;

@Service("ApisRepository")
public class ApisRepositoryImpl implements ApisRepository {

    public String getApis() {
        return "Apis have been gotten brote";
    }
}
