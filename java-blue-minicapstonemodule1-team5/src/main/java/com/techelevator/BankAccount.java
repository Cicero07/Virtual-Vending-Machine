package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class BankAccount {

    private double currentBalance;



    public BankAccount(double currentBalance) {
        this.currentBalance = 0.0;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double moneyFed) {
        this.currentBalance = currentBalance + moneyFed;
    }


    public void addMoney(double moneyFed) {
        if (moneyFed > 0) {
            this.currentBalance += moneyFed;
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private int itemCounter = 0;
    public void subtractMoney(double amount) {
            itemCounter++;
        if (amount > 0 && amount <= currentBalance && itemCounter % 2 == 1) {
            this.currentBalance -= amount;

        } else if (amount > 0 && amount <= currentBalance && itemCounter % 2 == 0) {
            this.currentBalance = this.currentBalance - amount + 1;
        }
//            itemCounter++;
//            if (itemCounter%2 ==0){
//              this.currentBalance = this.currentBalance + 1; //itemCounter/2
//              }else if((itemCounter - 1) % 2 == 0){
//                   this.currentBalance += (itemCounter-1)/ 2;
//              }
         else {
            System.out.println("Invalid amount or insufficient funds.");
        }

    }
}

//    public void setItemPrice(double itemPrice) {
//       /* if (itemCount % 2 ==0){
//              totalCost -= itemCount / 2;
//              }else if((itemCount - 1) % 2 == 0){
//                   totalCost -= itemCount - 1 / 2;
//              }

