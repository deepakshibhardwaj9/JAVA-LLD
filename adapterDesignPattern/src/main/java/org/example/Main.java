package org.example;
import org.example.Adapter.ICICIBankAdapter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank adapter name : ");
        String bankname = sc.next();
        BankAPi aPi = bankFactory.getBank(bankname);

        PhonePe phonePe = new PhonePe(aPi);
        BankAccount account1 = new BankAccount(123,"bob",3000);
        BankAccount account2 = new BankAccount(342,"sam",2500);
        phonePe.upiTransaction(account2,account1,100);
    }
}