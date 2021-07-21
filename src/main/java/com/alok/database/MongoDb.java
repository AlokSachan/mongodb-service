package com.alok.database;

import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoDb {

    private final MongoTemplate mongo;

    public MongoDb(MongoTemplate mongo) {
        this.mongo = mongo;
    }
}
