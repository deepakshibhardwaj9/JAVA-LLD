import java.util.*;
/* Here a class "databaseUsingArraylist" is implemented using interface.
   A class should implement all the methods defined in interface, plus it can have extra methods and variables inside it.
   A class can implement more than one interfaces but a child class can only have a single parent class.
* */
public class databaseUsingArraylist implements CRUD
{
    ArrayList<Integer> table = new ArrayList<Integer>();
    Scanner sc  = new Scanner(System.in);

    //Implemented interface....
    @Override
    public void createData()
    {
        System.out.println("How many elements you want to add ?");
        int count = sc.nextInt();
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter the element");
            int element = sc.nextInt();
            table.add(element);
        }
    }

    @Override
    public void readData()
    {
        System.out.println("Elements in table are : ");
        for(int i=0;i<table.size();i++)
        {
            System.out.println("Index : " +(i+1) +" Element : " +table.get(i));
        }
    }

    @Override
    public void updateData()
    {
        int index, element;
        System.out.println("Give index at which you want to update");
        index = sc.nextInt();
        System.out.println("Give element you want to update.");
        element = sc.nextInt();
        table.set(index-1,element);
    }

    @Override
    public void deleteData()
    {
        System.out.println("Give the index of element you want to delete :" );
        int index = sc.nextInt();
        table.remove(index-1);
    }
}
