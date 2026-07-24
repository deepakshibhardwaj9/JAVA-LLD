package org.example;

public class IcIcIBankApi
{
    BankAccount account = null;
    public IcIcIBankApi()
    {
        account = new BankAccount();
        System.out.println("Inside ICici");
    }
    public void getBalance(BankAccount bankAccount)
    {
        bankAccount.getBalance();
    }

    public void creditAmount(BankAccount sender, BankAccount receiver, int amount)
    {
        sender.setBalance(sender.getBalance()-amount);
        receiver.setBalance(receiver.getBalance()+amount);
    }

    public void iciciCreditPoints()
    {
        account.setBalance(account.getBalance()+100);
    }
}
