package com.andon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author by yangzhi
 * @date 2018.08.27 13:13
 * @Moode o_O
 **/
@Repository
public class MongoService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(Object object)
    {
        mongoTemplate.insert(object);
    }
}
