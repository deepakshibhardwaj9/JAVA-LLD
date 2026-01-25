import java.util.*;
import java.util.Optional;

//Generic Inventory System
//Now there are more than one item in a store, as in stores we gave a particular box to a single item,
// that means here also we need to store each item in an independent storage.
// So, to store that we need a data-structure that will store items on a particular space.
// So we will use MAPS here.

public class Inventory <T extends Item>
{
    private Map<Integer,T> item;
    public Inventory(Map<Integer,T> items)
    {
        this.item = items;
    }

    public void addItem( T itemClass)
    {
        // If item is present
        if(inventorySize()!=0)
        {
            int size = inventorySize();
            item.put(size+1,itemClass);
        }
        //If item is not present
        else
        {
            item.put(1, itemClass);
        }
        if(item.containsKey(itemClass.getId()))
        {
            throw new DuplicateItem("This item is already added in Inventory....");
        }
    }

    //Add function to check the size of Map
    public int inventorySize()
    {
        return item.size();
    }
    public void removeItem( String id)
    {
        item.remove(id);
    }

    public T getItem(int id)
    {
        return item.get(id);
    }

    public List<T> getAllItems()
    {
        List<T> allItems = new ArrayList<>();
        for(T items: item.values())
        {
            allItems.add(items);
        }
        return allItems;
    }

    //STREAM API
    public  void  printIds()
    {
        //First create the list.
        List<T> items = getAllItems();
        items.stream().map(itemId ->itemId.getId())
                .forEach(x->System.out.println(x));     //forEach is used to print, so here foreach loop is travrsing over all itemId and then print it.
    }

    //Convert item names in Lowecase
    public void getItemsInLowerCase()
    {
        List<T> itemsList = getAllItems();
        List<String> result = itemsList.stream().map(item -> item.getName().toLowerCase())
                .toList();
        System.out.println("Item Names in lowercase letters : " +result.toString());
    }

    //length of item names
    public void createItemLengthOfList()
    {
        List<T> itemsList = getAllItems();
        List<Integer> result = itemsList.stream().map(item -> item.getName().length())
                .toList();
        System.out.println("Length of item names :"+result.toString());
    }

    public void priceGreaterThan0()
    {
        List<T> itemList = getAllItems();
        //Items with price above 1000
        Boolean priceGreater1000 = itemList.stream().
                anyMatch(xItem -> xItem.getPrice() > 1000);
        System.out.println("Do we have Items having price above 1000" + priceGreater1000);
    }

    public void itemsWithZeroQuantity()
    {
        List<T> itemList = getAllItems();
        try
        {
            Boolean itemQuantity = itemList.stream().allMatch(x -> x.getQuantity() <= 0);
        }
        catch (Exception e)
        {
            System.out.println("Exception :: " +e.getMessage());
        }
        System.out.println("Do we have items with Quantity greater than 0 : " +itemQuantity);
    }

    public void negativeQuantity()
    {
        List<T> items = getAllItems();
        try
        {

        }
        catch (Exception e)
        {

        }
        Boolean itemQuantity = items.stream().anyMatch(x->x.getQuantity()<0);
        System.out.println("Items with negative quantity : " +itemQuantity);
    }

    public void combinedOperation()
    {
        List<T> items= getAllItems();
        List<String> result =  items.stream().filter(x->x.getPrice()>1000 && x.getQuantity()>0)
                            .map(x->x.getName())
                            .distinct()
                            .sorted()
                            .limit(5).toList();
        System.out.println("Fetch items from combined Operations : " +result.toString());
    }

    //REduce functions
    public void getTotalQuantity()
    {
        List<T> items = getAllItems();
        int sum =items.stream()
                .map(x->x.getQuantity())
                .reduce(0,(totalSum,quantity)
                        -> totalSum+quantity);
        //totalSum nd quanttiy are two variables here, which initially has value 0.
        /* what Reduce function is doing:
        int total=0;
        for(Item x: items  )
        {
            total = total+ x.getQuantity();
        }
         */
        System.out.println("Total Quantity Sum : " +sum);
    }

    //get most expensive item using reduce()
    public void getExpensiveItem()
    {
        List<T> items = getAllItems();
        //Result is of OPTIONAL-TYPE
        Optional<T> expensiveItem = items.stream().
                                    reduce((item1,item2)
                                        -> item1.getPrice()>item2.getPrice()?item1 :item2);
        if(expensiveItem.isPresent()) {
            System.out.println("Expensive Item is : " + expensiveItem.get());
        }

    }

    //Concatinate
    public void concatinateStrings()
    {
        List<T> itemsList = getAllItems();
        Optional<String> result = Optional.ofNullable( getAllItems().stream().map(x->x.getName())
                .reduce("DefaultValue",(a,b)->a +" , " +b));
    }

}
