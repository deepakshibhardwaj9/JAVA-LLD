package org.example.Transaction;

public class SQLTransaction implements Transaction
{
    @Override
    public void executeTransaction() {
        System.out.println("Execute transaction for SQL.......");
    }
}
