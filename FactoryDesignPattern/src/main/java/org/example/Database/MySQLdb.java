package org.example.Database;

import org.example.Factory.MySQLFactory;
import org.example.Factory.databaseFactory;

public class MySQLdb extends Database
{
    databaseFactory db;
    @Override
    public databaseFactory createDatabase() {
        System.out.println("From SQL");
        return db = new MySQLFactory();
    }
}
