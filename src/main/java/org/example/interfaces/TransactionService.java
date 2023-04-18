package org.example.interfaces;

import org.example.models.Transaction;

public interface TransactionService {
    public Transaction addNewTransaction();

    public Transaction getTransaction(Transaction retrievedTransaction);

    Transaction AddNewTransaction();
}
