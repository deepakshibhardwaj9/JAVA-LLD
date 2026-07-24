package org.example.Adapter;

import org.example.BankAPi;
import org.example.BankAccount;
import org.example.YesBankAPI;

public class YesBankAdapter implements BankAPi
{
    private YesBankAPI yesBankAPI;
    @Override
    public void sendMoney(BankAccount sender, BankAccount receiver, int amount)
    {
        yesBankAPI.sendMoney(sender,receiver,receiver.getBalance()+amount);
        yesBankAPI.sendMoney(sender,receiver,sender.getBalance()-amount);
    }

    @Override
    public void fetchBalance(BankAccount customer)
    {
        customer.getBalance();
    }

    @Override
    public void doTransaction()
    {
        System.out.println("Perform trnasaction...");
    }
}