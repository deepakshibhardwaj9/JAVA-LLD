package org.example;

import org.example.Database.Database;
import org.example.Factory.databaseFactory;
import org.example.Query.Query;
import org.example.Transaction.Transaction;

public class UserService
{
    Database db;
    UserService(Database database)
    {
        db = database;
    }
    public void login()
    {
        databaseFactory factory = db.createDatabase();
        Query q1 = factory.createQuery();
        q1.executeQuery();
        Transaction q2 = factory.createTransaction();
        q2.executeTransaction();
    }

}
