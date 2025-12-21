public abstract class User
{
    /*
    WHY ALL THE ATTRIBUTES SET AS A PRIVATE??
    For every class generally make attributes private and on top of it, expose those attributes using getters and setters.
    This is best practice. It gives us extra control over attributes on which we want to give control VS the attributes on which we don't want to give control.
    Unless there is a reason defined to make your attributes as public/protected than only set attributes as public/protected.
    "final" keyword : It is used when we don't want to change the value of attribute once assigned.
    So we make userId as final, because once we assign I'd to user, there is no need to change it.
    'constant' and 'final' keywords are different.

     */

    private int idCounter=0;
    private String userId; //private final String userId;
    private String name;
    private String contactInfo;

    User()
    {
        // I added No-parameterized Constructor because when I tried to extend User class for Librarian Class, compiler give error  "There is no parameterless constructor available in 'User'....".
        this.userId = generateUniqueId();
    }

    //Parameterized Constructor
    User(String name,String contactInfo)
    {
        this.name=name;
        this.contactInfo = contactInfo;
    }
    User(String  id, String userName, String contact)
    {
        this.userId = generateUniqueId();
        this.name = userName;
        this.contactInfo = contact;

    }

    //this will generate a random unique I'd to give a random userId for every user.
    private String generateUniqueId() {
        return String.valueOf(++idCounter);
    }

    // this will display borrowed books or some other data
    //maked it abstract because each class can have its own implementation
    public abstract void  displayDashboard();

    //return true is borrowedBooks<MAX_BORROW_LIMIT
    //maked it abstract because each class can have its own implementation
    public abstract boolean canBorrowBooks();
}