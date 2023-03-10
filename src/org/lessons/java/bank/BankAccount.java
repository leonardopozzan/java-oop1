package org.lessons.java.bank;

import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        Random random = new Random();
        this.accountNumber = random.nextInt(1,1001);
        this.balance = 0;
    }

    public BankAccount() {
        this("");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount){

        if(this.balance >= amount){
            this.balance -= amount;
            return true;
        }else {
            return false;
        }
    }

    public void printFormattedBalance(){
        System.out.println("Ciao "+ this.ownerName);
        System.out.println("Il saldo del tuo conto n." + this.accountNumber + " ora è di: " + this.balance + " €");
    }
}
