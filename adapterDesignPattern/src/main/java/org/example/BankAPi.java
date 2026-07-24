package org.example;

public interface BankAPi
{
    void sendMoney(BankAccount sender, BankAccount receiver, int amount);
    void doTransaction();
    void fetchBalance(BankAccount customer);
}
