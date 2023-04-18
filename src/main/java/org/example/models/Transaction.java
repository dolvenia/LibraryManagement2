package org.example.models;

public class Transaction {

    private int TransactionId;

    private int UserId;

    public Transaction(int TransactionId, int UserId){
            this.TransactionId = TransactionId;
            this.UserId = UserId;
    }

    public Transaction(){

    }

    public int getTransactionId(){

        return TransactionId;
    }

    public void setTransactionId(int TransactionId){

        this.TransactionId = TransactionId;
    }

    public int getUserId(){

        return UserId;
    }

    public void setUserId(int UserId){

        this.UserId = UserId;
    }
}
