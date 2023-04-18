package org.example.models;

public class Bill {
    private int BillNo;

    private int UserId;

    private double amount;


    public Bill(int BillNo, double amount){
        this.BillNo = BillNo;
        this.amount = amount;
    }

    public Bill(){

    }

    public int getBillNo(){

        return BillNo;
    }

    public void setBillNo(int BIllNo){

        this.BillNo = BillNo;
    }

    public int getUserId(){

        return UserId;
    }

    public void setUserId(int UserId){

        this.UserId = UserId;
    }

    public double getAmount(double amount){

        return amount;
    }
}
