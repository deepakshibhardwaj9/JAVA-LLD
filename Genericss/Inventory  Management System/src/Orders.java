import java.awt.event.ComponentAdapter;
import java.util.*;

public class Orders implements Comparable<Orders>
{
    //Any order that is placed in a system, contains prioriy of order as well.
    //One is, order is a normal-order.
    //Second is, order is express-order.
    private int order_id;
    private boolean expressDelivery;

    //CONSTRUCTOR
    public Orders(int order_id, boolean expressDelivery)
    {
        this.order_id = order_id;
        this.expressDelivery=expressDelivery;
    }

    //GETTERS AND SETTERS
    public void setOrder_id(int order_id)
    {
        this.order_id = order_id;
    }

    public int getOrder_id()
    {
        return order_id;
    }

    public void setExpressDelivery(boolean expressDelivery)
    {
        this.expressDelivery = expressDelivery;
    }

    public boolean isExpressDelivery()
    {
        return expressDelivery;
    }


    // Now i want to sort the Orders on the basis of Priority, that first Express-Orders and than Normal-Orders.
    // So we need a simple sorting-logic that particular order is Express Order or not....
    // We can also implement priorityQueue here as well. But we will use here Comparables.


    @Override
    public int compareTo(Orders o)
    {
        // If both are express orders, then sort by ID.
        return this.order_id-o.order_id;
    }

}