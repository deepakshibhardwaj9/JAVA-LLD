/* Student class also implement Abstract User class.
* */
public class Student extends User
{
    public String userId;

    Student(String id)
    {
        this.userId = id;
        login();
        userDetails();
    }
    @Override
    public void login() {
        System.out.println("Logged to database as a Student.");
    }

    @Override
    public void userDetails() {
        System.out.println("User id is : "+userId);
    }
}
