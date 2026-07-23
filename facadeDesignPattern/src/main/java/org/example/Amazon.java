package org.example;
import org.example.itemSelection;
import org.example.Cart;
import org.example.orderPlaced;
import org.example.*;
public class Amazon
{
    Amazon()
    {
        System.out.println("Welcome to Amazon");
    }
    public static void buyProduct()
    {
        itemSelection.selectItem();
        Cart.moveToCart();
        Payment.paymentMode();
        orderPlaced.placeOrder();
    }


}
