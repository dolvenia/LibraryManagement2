package org.example.services;

import org.example.interfaces.BillService;
import org.example.models.Bill;

import java.sql.SQLOutput;
import java.util.Scanner;
public class BillServiceImple implements BillService{

    @Override
    public Bill addNewBill() {
        Scanner input = new Scanner(System.in);

        System.out.print("BillNo: ");
        int BillNo = input.nextInt();

        System.out.print("UserId: ");
        int UserId = input.nextInt();


        return null;
    }

    @Override
    public Bill getBill(Bill retrievedBill) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the days book was returned:  ");
        int days = input.nextInt();

        int amount;
        int totalDue = 0;

        if (days > 0 && days <= 6)
        {
            amount = 1;
            totalDue = days * amount;
          System.out.print("Amount owed:  " + totalDue);
        }
        else if (days > 6 && days <= 10)
        {
            amount = 2;
            totalDue = days * amount;
           System.out.print("Amount owed:  " + totalDue);
        }
        else if (days > 10)
        {
            System.out.print("User access will be terminated");
        }
        else
        {
           System.out.print("Not valid");
        }
        return retrievedBill;
    }



}
