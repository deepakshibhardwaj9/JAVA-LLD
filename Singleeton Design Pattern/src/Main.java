//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //If adress of both connection1 and connection2 are same than it follows single threaded Singleton Design pattern.
        dbConnetion connetion1 = dbConnetion.createConnection();
        System.out.println("Database connection1: " +connetion1);
        dbConnetion connetion2 = dbConnetion.createConnection();
        System.out.println("Database connection2:  "+connetion2);

        //Multithreaded db connection
        MultithreadedDBConnection connection4 = MultithreadedDBConnection.createConnection();


        //
        EagerLoadingDBConnection loadingDBConnection = EagerLoadingDBConnection.createConnection();
        System.out.println("Eager Loading connection 1 : " +loadingDBConnection);
    }
}