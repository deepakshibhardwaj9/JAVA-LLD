import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        //We can create a animal object
        Animals animal = new Animals();

        //A child class's object can be of parent-type
        Animals dog = new Dog();

        //List of dogs
        List<Dog> dogsList = new ArrayList<>();
        Dog dog2 = new Dog();
        /* We cannot add animal to dogList because Animal is a parent-class and child is not equal to parent-class.
         * dogsList.add(animal);
         * DOG-List cannot extend Animal-List.
         */
        dogsList.add(new Dog());
        dogsList.add(dog2);

        /*But we can add child-class to parent-class object due to polymorphism.*/
        List<Animals> animalsList = new ArrayList<>();
        animalsList.add(dog);
        animalsList.add(dog2);



    }
}