import java.util.*;

public class Books
{
    Scanner sc = new Scanner(System.in);
    String bookName;
    int bookId = 100;
    HashMap<Integer,String> totalBooks= new HashMap<>();

    public void addBook(String bookName)
    {
        totalBooks.put(bookId++,bookName);
    }

    //Method Overloading
    //i.e. if we want to add a book with specific Id.
    public void addBook(String bookName, int bookId )
    {
        totalBooks.put(bookId++,bookName);
    }

    public void removeBook(int bookId)
    {
        if(totalBooks.containsKey(bookId))
        {
            String bookName = totalBooks.remove(bookId);
            System.out.println(bookName +" this book is removed.");
        }
        else
        {
            System.out.println(bookId +" is not available");
        }
    }

    public void displayBooks()
    {
        // We should not use this for-loop because, maps does not have indexes. keySet() return all keys,values() return all values.
        // Instead of using for-loop, we should use " Iterator() and entrySet() ".
        // for(int i=1;i<=totalBooks.size();i++)
        // {
        // System.out.println(totalBooks.keySet()+"..... " + totalBooks.values());
        // }
        Iterator<HashMap.Entry<Integer, String>> iterator = totalBooks.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Book name is " +entry.getValue() +" and book-id is :" +entry.getKey());

        }
    }
}