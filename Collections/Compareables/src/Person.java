public class Person implements Comparable<Person>
{
    String Name;
    int age;
    double Weight;
    Person(String Name, int age, double Weight)
    {
        this.Name = Name;
        this.age = age;
        this.Weight = Weight;
    }

    @Override
    public String toString() {
        return "Person [name=" +Name + ", age=" +age + ", weight=" +Weight + " kgs]";
    }

    //Interface will force to give you definition of this method.

////    SORT VIA AGE i.e. RETURN VALUE IS INT.
//    @Override
//    public int compareTo(Person obj) {
//        // sort by Age
//        return this.age - obj.age;
//        /* if (this.age < obj.age) give negative value.
//         *  if(this.age = obj.age) returns 0.
//         *  if (this.age > obj.age) return positive value.
//         * */
//    }


////  SORT VIA WEIGHT WITH RETURN-TYPE AS DOUBLE
//    @Override
//    public int compareTo(Person obj)
//    {
//        //sort by Weight
//        //// Use Double.compare for safe and reliable comparison of double values.Compareable doesnot return DOUBLE values.
//        return Double.compare(this.Weight,obj.Weight);
//    }


/// SORT STRING VALUES
    @Override
    public int compareTo(Person obj)
    {
        return this.Name.compareTo(obj.Name);
    }


    // So this becomes our sorting logic for this specific class.
    /**
     * Limitations of Comparable:
     *
     * 1. Single Natural Ordering -- Can use only one attribute for natural sorting order.
     * 2. Inflexibility -- class modification is needed.
     */
}
