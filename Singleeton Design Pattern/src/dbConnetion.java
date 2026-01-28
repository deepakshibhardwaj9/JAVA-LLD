public class dbConnetion
{
    private  static dbConnetion connection = null;
    String url;
    String userNAme;
    String password;
    private dbConnetion()
    {
    }

    //This code is a single-threaded Singleton
    public static dbConnetion createConnection()
    {
        if(connection==null)
        {
            return connection = new dbConnetion();
        }
        return connection;
    }
}
