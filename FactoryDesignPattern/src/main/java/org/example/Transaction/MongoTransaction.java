package org.example.Transaction;

public class MongoTransaction implements Transaction
{
    @Override
    public void executeTransaction() {
        System.out.println("Executed Transaction for Mongo database......");
    }
}
