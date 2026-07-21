package org.example.Database;
import org.example.Factory.databaseFactory;

public abstract class Database
{
    int poolSize = 5;

    public void increasePoolSize()
    {
        poolSize =+5;
    }
    public abstract databaseFactory createDatabase();
}
