package org.example;

import org.example.Adapter.ICICIBankAdapter;
import org.example.Adapter.YesBankAdapter;

public class bankFactory
{
    //Now this is following Liskov Substitution Principle

    public static BankAPi getBank(String  bankAPIName)
    {
        if(bankAPIName.equalsIgnoreCase("yesbankAdapter"))
        {
            return new YesBankAdapter();
        }
        else if(bankAPIName.equalsIgnoreCase("icicibankadapter"))
        {
            return new ICICIBankAdapter();
        }
        else
        {
            throw new IllegalArgumentException("Bank not found");
        }
    }
}
