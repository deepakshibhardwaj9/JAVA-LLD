//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //This is simpky how we divide:
        Main m = new Main();
        double ans= m.divide(10,5);
        System.out.println("Divide : " +ans);

        // What if the input is not sufficient than we cant directly represent the error to USer, instead we give a message to user using try-catch block.
        try
        {
            //Write logic here
            m.divide(10,0);
        }
        catch (Exception e)
        {
            //Give the message you want to display
            System.out.println("Input is not correct, please give input again.");
        }
        finally
        {
            System.out.println("This block will always run....");
        }
    }
        public double divide(int a, int b)
        {
            return a/b;
        }
}