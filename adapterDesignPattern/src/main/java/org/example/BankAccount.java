package org.example;

public class BankAccount
{
    private int accountNumber;
    private String holderNAme;
    private int balance;

    BankAccount()
    {}

    BankAccount(int accountNumber, String holderNAme,int balance)
    {
        this.accountNumber = accountNumber;
        this.holderNAme = holderNAme;
        this.balance = balance;
    }
    public int getBalance()
    {
        return this.balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderNAme() {
        return holderNAme;
    }

    public void setHolderNAme(String holderNAme) {
        this.holderNAme = holderNAme;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
