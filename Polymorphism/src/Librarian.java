import java.util.Scanner;

public class Librarian extends User
{
    Scanner sc = new Scanner(System.in);
    String librariaName;
    Librarian(String librariaName)
    {
        //we are calling parent method here, so that it can assign a name to User.
        super(librariaName);
    }

    //Method Overriding
    @Override
    public void borrowBook(Books book)
    {
        //Librarian can add/remove any book.
        System.out.println("Enter book id you want to borrow");
        int id = sc.nextInt();

        //this will call User class method i.e. parent method
        book.removeBook(id);
    }


}
