public class Person
{
    String Name;
    int age;
    Double Weight;
    Person(String  Name, int age, Double Weight)
    {
        this.Name = Name;
        this.age = age;
        this.Weight = Weight;
    }

    public  String getName()
    {
        return  Name;
    }

    public int getAge()
    {
        return age;
    }

    public Double getWeight()
    {
        return Weight;
    }

    @Override
    public String toString()
    {
        return "Perso : { " +Name +" is Name, " +age +" is age, " +Weight +" is weight }";

    }
}
