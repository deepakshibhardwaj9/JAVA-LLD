package org.example;

import org.example.Database.Database;
import org.example.Database.MongoDb;
import org.example.Database.MySQLdb;

public class SimpleFactory
{

    public Database getDatabase(String  name)
    {
        if(name.equalsIgnoreCase("mongodb"))
        {
            return new MongoDb();
        }
        else if(name.equalsIgnoreCase("mySQL"))
        {
            return new MySQLdb();
        }
        else {
            return null;
        }
    }
}
