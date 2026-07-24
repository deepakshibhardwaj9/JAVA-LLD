package org.example;

public class PhonePe
{
    private BankAPi bankAPi ;
    public PhonePe(BankAPi bankAPi)
    {
        this.bankAPi = bankAPi;
    }

    public void upiTransaction(BankAccount sender, BankAccount receiver, int amount)
    {
        if(sender.getBalance() < amount)
        {
            throw new RuntimeException("Insuffiencent balance...");
        }
        bankAPi.sendMoney(sender,receiver,amount);
        System.out.println("Total amount in " +receiver.getHolderNAme() +" account is now :" +receiver.getBalance());
        System.out.println("Total amount in "+sender.getHolderNAme() + " account is : " +sender.getBalance());
    }
}
