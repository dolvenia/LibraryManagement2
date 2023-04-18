package org.example.services;

import org.example.interfaces.TransactionService;

import java.util.Scanner;
public abstract class TransactionServiceImple implements TransactionService {
    @Override
    public org.example.models.Transaction AddNewTransaction() {
        Scanner input = new Scanner(System.in);

        System.out.print("TransactionId: ");
        int TransactionId = input.nextInt();

        System.out.print("UserId: ");
        int UserId = input.nextInt();


        return null;
    }
}
