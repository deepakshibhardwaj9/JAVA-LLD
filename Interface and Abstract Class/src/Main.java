//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //Instruct and Student class implement Abstract class
        System.out.println("Lets logged into database............");
        Instructor instructor1 = new Instructor("239");
        Student student1 = new Student("1003");

        //'databaseUsingArraylist' is created using CRUD interface.
        System.out.println("Create object using 'databaseUsingArraylist' Class..............");
        databaseUsingArraylist d1 = new databaseUsingArraylist();
        d1.createData();
        d1.readData();
        d1.updateData();
        d1.readData();
        d1.deleteData();
        d1.readData();

        student1.logOut();
        //instructor1.logOut();
        // We can also implement CRUD interface using different databases as well, like stack, linked list,etc.
    }
}