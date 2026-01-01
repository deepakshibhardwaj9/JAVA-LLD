/*User is created Abstract, because USER can be any student/instructor/etc.
  Abstract class we have defined methods and methods with their  definition which child class must have, i.e. it has incomplete methods. Child class will implement and give definition of these methods.
  Objects are not created of abstract class.
  We can make a class abstract when we don't want objects of that class.
*/
public abstract class User
{
    public abstract void login();
    public abstract void userDetails();
    public  void logOut()
    {
        System.out.println("User Logged Out !!");
    }
}
