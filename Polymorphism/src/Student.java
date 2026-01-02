import java.util.Scanner;

public class Student extends User
{
    Scanner sc = new Scanner(System.in);
    int id = 0;
    Student(String studentName)
    {
        super(studentName);
        id=id+1;
    }

    @Override
    public void borrowBook(Books book)
    {
        System.out.println("Enter the book Name you want to borrow : ");
        int bookId = sc.nextInt();
        book.removeBook(bookId);
    }
}
