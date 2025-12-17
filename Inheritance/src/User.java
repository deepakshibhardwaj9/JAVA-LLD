// This is Parent class.
public class User
{
    String userName;
    String password;

    User()
    {
      System.out.println("Hello I am in No arrgument USER constructor.");
    }

    User(String userN, String pass)
    {
        System.out.println("USER Parameterized COnstructor with name and password.");
        this.userName = userN;
        this.password = pass;
    }
    User(String userN)
    {
        System.out.println("USER Parameterized COnstructor with name.");
    }
    public  void logIn()
    {
        System.out.println("USER Logged IN!");
    }
    public void  logOut()
    {
        System.out.println("USER Logged OUT!");
    }

}
