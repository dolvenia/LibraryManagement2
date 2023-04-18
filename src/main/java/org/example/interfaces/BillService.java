package org.example.interfaces;

import org.example.models.Bill;
public interface BillService {
    public Bill addNewBill();

    public Bill getBill(Bill retrievedBill);
}
