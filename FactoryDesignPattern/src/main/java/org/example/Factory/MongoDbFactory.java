package org.example.Factory;

import org.example.Query.MongoQuery;
import org.example.Query.Query;
import org.example.Transaction.MongoTransaction;
import org.example.Transaction.Transaction;

public class MongoDbFactory implements databaseFactory
{
    @Override
    public Query createQuery() {
        System.out.println("Create query from Mongo Db....");
        return new MongoQuery();
    }

    @Override
    public Query readData() {

        System.out.println("Read query from Mongo Db....");
        return new MongoQuery();
    }

    @Override
    public Query updateQuery()
    {
        System.out.println("Update query from Mongo Db....");
        return new MongoQuery();

    }

    @Override
    public Query deleteQuery()
    {
        System.out.println("Delete query from Mongo Db....");
        return new MongoQuery();
    }

    @Override
    public Transaction createTransaction() {
        System.out.println("Transaction created of Mongo Db.....");
        return new MongoTransaction();
    }
}
