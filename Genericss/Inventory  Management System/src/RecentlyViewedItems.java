import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems
{
    //default size of List
    private int maxSize = 5;

    //we used Doubly Linked List so that we can operate the list from both the ends.
    private LinkedList<Item> items;
    public  RecentlyViewedItems(LinkedList<Item> items)
    {
        this.items = items;
    }

    //Removed the last entered item and add the most recently visited array.
    public void addRecentlyViewedItem(Item item)
    {
        if(items.size()>=maxSize)
        {
            items.removeLast();
        }
        // max size is lesser than maxSize than also we need to remove the item.
        items.remove(item);
        items.addFirst(item);
    }

    //Get all Last viewed Items
    public List<Item> getAllViewedItems()
    {
        // WHY we are returning list as a arrayList instead of LinkedList/single-single items??
        // Because it is a good practice to return the values in form of arraylist to the client, other than this there is no logic behind it.
        return new ArrayList<>(items);
    }
}