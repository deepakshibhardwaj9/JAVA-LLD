package org.example.Factory;

import org.example.Query.Query;
import org.example.Query.mySqlQuery;
import org.example.Transaction.SQLTransaction;
import org.example.Transaction.Transaction;

public class MySQLFactory implements databaseFactory
{
    @Override
    public Query createQuery() {
        System.out.println("Create query from MySQL Db....");
        return new mySqlQuery();
    }

    @Override
    public Query readData() {

        System.out.println("Read query from MySQL Db....");
        return new mySqlQuery();
    }

    @Override
    public Query updateQuery()
    {
        System.out.println("Update query from MySQL Db....");
        return new mySqlQuery();

    }

    @Override
    public Query deleteQuery()
    {
        System.out.println("Delete query from MySQL Db....");
        return new mySqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        System.out.println("Create a transaction of SQL database......");
        return new SQLTransaction();
    }
}