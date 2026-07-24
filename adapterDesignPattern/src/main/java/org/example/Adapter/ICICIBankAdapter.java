package org.example.Adapter;

import org.example.BankAPi;
import org.example.BankAccount;
import org.example.IcIcIBankApi;

public class ICICIBankAdapter implements BankAPi {
    private IcIcIBankApi icIcIBank;

    public ICICIBankAdapter()
    {
        icIcIBank = new IcIcIBankApi();
    }

    @Override
    public void sendMoney(BankAccount sender, BankAccount receiver, int amount)
    {
        icIcIBank.creditAmount(sender,receiver,receiver.getBalance()+amount);
        icIcIBank.creditAmount(sender,receiver,sender.getBalance()-amount);
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