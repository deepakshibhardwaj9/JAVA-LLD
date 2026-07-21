package org.example.Database;

import org.example.Factory.MongoDbFactory;
import org.example.Factory.databaseFactory;

public class MongoDb extends Database
{
    static databaseFactory db;
    @Override
    public databaseFactory createDatabase()
    {
        System.out.println("From Mongo");
        db = new MongoDbFactory();
        return  db;
    }
}
