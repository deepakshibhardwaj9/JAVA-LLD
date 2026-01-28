public class MultithreadedDBConnection implements Runnable
{
    private static MultithreadedDBConnection connection = null;
    String userName;
    String url;
    String password;
    private MultithreadedDBConnection()
    {
    }

    @Override
    public void run()
    {
        createConnection();
    }

    public static MultithreadedDBConnection createConnection()
    {
        if(connection == null)
        {
            //take a lock
            synchronized (MultithreadedDBConnection.class)
            {
                //again take a lock and it is than Double Check Locking.
                if(connection==null)
                {
                    connection =new MultithreadedDBConnection();
                    return connection;
                }
            }
        }
        return connection;
    }
}