package org.example;

public class YesBankAPI
{
    BankAccount account = null;
    YesBankAPI()
    {
        account = new BankAccount();
        System.out.println("Inside YES BANK");
    }
    public void checkBalance(BankAccount bankAccount)
    {
        bankAccount.getBalance();
    }

    public void sendMoney(BankAccount sender, BankAccount receiver, int amount)
    {
        sender.setBalance(sender.getBalance()-amount);
        receiver.setBalance(receiver.getBalance()+amount);
    }

    public void yesCreditPoints()
    {
        account.setBalance(account.getBalance()+122);
    }
}
