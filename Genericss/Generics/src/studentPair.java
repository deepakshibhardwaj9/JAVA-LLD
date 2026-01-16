public class studentPair <D,B> {
    D studentName;
    B studentAge;
    D studentLastNAme;


    //These are Generic methods, that means these methods are in synchronize with class-datatype.
    //These methods are only be accessed when instance of this class exists.
    //
    public D getStudentName() {
        return studentName;
    }

    public B getStudentAge() {
        return studentAge;
    }

    //static-generic method
    public static <E> void setStudentLastNAme(E lastNAme)
    {
        System.out.println(lastNAme);
    }

    //static-Genericmethod with returnType
    public static <R> R setStudentCourse(R course)
    {
        return course;
    }
}
