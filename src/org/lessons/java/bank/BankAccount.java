package org.lessons.java.bank;

public class BankAccount {
    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public BankAccount() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
