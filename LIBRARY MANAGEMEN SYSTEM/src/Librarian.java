public class Librarian extends User
{
    private String employeeNumber;

    Librarian(String name,String contactInfo,String  employeeNumber)
    {
        super(name,contactInfo);
        this.employeeNumber=employeeNumber;
    }
    //Librarian Dashboard
    @Override
    public void displayDashboard()
    {
        System.out.println("Librarian Dashboard :");
        System.out.println("Employee number :"+employeeNumber);
    }

    //Librarian can borrow all books.
    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    //just to print the information
    public void addNewBook(Book book)
    {

    }

    //just to print the information
    public void removeBook(Book book)
    {

    }
}
