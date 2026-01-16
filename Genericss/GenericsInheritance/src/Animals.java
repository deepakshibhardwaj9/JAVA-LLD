import java.util.List;

public class Animals
{
    //If i want to take input from Parent class Or any child-class of Parent-Class
    public void inputParentChild(List<? extends Animals> list)
    {

    }

    //? means input can be from any child-class of Animal.
    //Example Dog/Cat are child of Animals class that means now Animal,Dog,Cat can give input for this method only.


    /* If you want to pass child-class or parents-class of that parrticular child-class than use this 'super' method.
    * */

    public  void  input(List<? super Dog> list)
    {
        //'super' will call any parent of (Animal object) Dog class only OR Dog-class itself
        //
    }
}
