public abstract class User
{
    String userName;
    int userId;
    int id=0;

    User(String name)
    {
        this.userName = name;
        id = id+1;
    }

    //I pass Book as an Argument so any user can directly access Books class and can add/remove a book.
    //Because student and librarian both can take books, so i added removeBook() in Parent class.
    //As only Librarian can add new book, so we will give access to Librarian to add new Books,( i.e. AddBook())
    public void borrowBook(Books books)
    {
        System.out.println("Users can borrow limited books.");
    }

}