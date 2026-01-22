import java.io.PrintStream;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        //Way 1 : ANONYMOUS CLASS : It creats an object of interface without creating the class of interface
        Person teacher = new Person()
        {
            @Override
            public void reteirement(int age)
            {
                System.out.println("Retirement age of teacher :" +(age+30));        //if we do S.O.P("....." +age+30), it will do concatination.
            }
        };
        teacher.reteirement(17);

        //Way 2 : Create object of Person class using LAMBDA function.
        Person employee = (age) ->
        {
            System.out.println("Retirement of employee is : " +(age+30));
        };
        employee.reteirement(25);

        //Way 3 : Optimize lambda function,skip{} when function has single-line of code.
        Person professor = (int age)-> System.out.println("Retirement of Professor is :" +(age+30));
        professor.reteirement(34);
        System.out.println("//--------------------------------------------------------------------------------------------------------------------------------\n");
        //Way 1 : ANONYMOUS CLASS, pre-defined functions in " java.util.function ".
        Consumer<String>  obj = new Consumer<String>() {
            @Override
            public void accept(String s)
            {
                System.out.println("Hello from Consumer Anonymous class object: " +s);
            }
        };
        obj.accept("Mr. Navjot");

        //Way 2 : Consumer class using Lambda function
        Consumer<String> consumer = (S)->
        {
            System.out.println("Hello from Consumer Lambda function : " +S);
        };
        consumer.accept("WElcomeee....");

        //Way 3 : Optimization of Lambda function, skip {}
        Consumer<Integer> consumer1 = (Integer i )->
                System.out.println("Hello from Optimized Lambda inside Consumer :" +i);
        consumer1.accept(2026);

        System.out.println("//--------------------------------------------------------------------------------------------------------------------------------\n");
        //Way 1: Create object of BiConsumer functional-interface using anonymous class
        BiConsumer<String,Integer> obj2 = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("Hello from BiConsumer Object using anonymous object......");
                System.out.println("Hello " +s +" Please pay total : " +integer);
            }
        };
        obj2.accept("Mr. Navjot" ,3400);

        // Way 2:  using LAMBDA FUNCTIONS
        BiConsumer<String,Integer> biConsumer = (S, In) ->
        {
            System.out.println("Hello from Lambda function of BiConsumer object.......");
            System.out.println("Print from Lambda BiConsumer function " +S +In);
        };
        biConsumer.accept("I will Do it till " ,27);

        //Way 3: Optimized lambda function by skipping {}, for single-line of code
        BiConsumer<Double , Integer> consumer2 = (Double a,Integer b) -> System.out.println("Hello from optimized lambda function with more than one arguments in it : " +a +" " +b);
        consumer2.accept(10.1,44);

        System.out.println("//--------------------------------------------------------------------------------------------------------------------------------\n");
        // Created BINARY OPERATORS using Lambda
        System.out.println("Binary Operations using Lambda : ");
        BinaryOperator<Integer> addOperation = (a,b)->
        {
            return a+b;
        };

        BinaryOperator<Double> multiply = (a,b)->
        {
          return a*b;
        };

        //THIS IS CORRECT SYNTAX FOR OPTIMIZATION OF LAMBDA IF IT HAS RETURN TYPE
        BinaryOperator<Double> divide = (Double a, Double b) -> a/b;

        System.out.println("Add 10313,42415 --> " +addOperation.apply(10313,42415)
        +" Mutiply : 145,53 -->" +multiply.apply(145.00,53.0) + " Divide 54.0 ,45.0 -->" + divide.apply(54.0,45.0));


        System.out.println("//--------------------------------------------------------------------------------------------------------------------------------\n");        //Way 1: Implement runnables using anonymous functions
        Runnable runnable1 = new Runnable() {
            @Override
            public void run()
            {
                System.out.println("Hello to the thread from Runnable using Anonymous object : " +Thread.currentThread().getName());
            }
        } ;
        //Way 2 : IMPLEMENT RUNNABLE FUNCTIONAL-INTERFACE USING LAMBDA
        Runnable runnable = ()->
        {
           System.out.println("Hello thread from Lambda function :" +Thread.currentThread().getName());
        };

        //Way 3 : Implement runnable using optimized lambda function i.e. using lambda expression
        Runnable runnable2 = () -> System.out.println("Hello from Optimized Lambda Runnables : " +Thread.currentThread().getName());
//--------------------------------------------------------------------------------------------------------------------------------

System.out.println("//--------------------------------------------------------------------------------------------------------------------------------\n");

        //Way 1: Simple thread creation :
        Thread t1 = new Thread();

        //Way 2: Thread Creation using anonymous classes

        //Way 3: Thread Creation using Lambda block

        //Way 4 : Thread Creation using Lambda expression

        //OPTIMIZATION OF LAMBDAS
        Thread t1 = new Thread(
                ()-> System.out.println("Thread t1 : " +Thread.currentThread().getName())
        );
        t1.start();

    }
}