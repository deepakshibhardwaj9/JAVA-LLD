/*  Instructor is Child class of Abstract class, so it should have implementation of all methods defined in Abstract class.
    It can have extra methods except the abstract methods.
**/
public class Instructor extends User
{
    public String instrucorId;
    Instructor(String id)
    {
        this.instrucorId= id;
        login();
        userDetails();
    }
    @Override
    public void login()
    {
        System.out.println("Logged In to database as a Instructor");
    }
    public void userDetails()
    {
        System.out.println("Instructor id is :" +instrucorId);
    }
}
