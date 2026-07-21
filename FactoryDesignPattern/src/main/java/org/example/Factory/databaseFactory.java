package org.example.Factory;

import org.example.Query.Query;
import org.example.Transaction.Transaction;

public interface databaseFactory
{
    Query createQuery();
    Query readData();
    Query updateQuery();
    Query deleteQuery();
    Transaction createTransaction();
}
