public class EagerLoadingDBConnection
{
    //This will create the connection at compile time.
    //Every time the code will compiled this will create a new connection.
    private  static EagerLoadingDBConnection connection = new EagerLoadingDBConnection();

    EagerLoadingDBConnection()
    {}

    public static EagerLoadingDBConnection createConnection()
    {
        return connection;
    }
}
