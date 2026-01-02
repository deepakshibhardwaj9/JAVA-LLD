import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        /* POLYMORPHISM : It means many-forms.
           So polymorphism is of two types : 1) Method Overloading/Compile-time Polymorphism
                                             2) Method Overriding/Runtime Polymorphism
        */

        //Books are added
        Books book = new Books();
        book.addBook("Science");
        book.addBook("English");
        book.addBook("Punjabi");
        book.addBook("Maths");
        book.addBook("Hindi");
        book.addBook("Social SCience");

        book.displayBooks();

        //Method Overriding
        /*It is also called Runtime polymorphism because it starts taking input at runtime.
         *At runtime application-methods start taking inputs.
         * */
        System.out.println("Librarian Object.........");
        User librarian1 = new Librarian("Joy Abraham");
        librarian1.borrowBook(book);
        book.displayBooks();


        System.out.println("Student Object.........");
        User student = new Student("Alpha");
        student.borrowBook(book);

    }
}