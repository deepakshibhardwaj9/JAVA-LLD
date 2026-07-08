PROBLEM:
Too many parameters in a class, which is not handled only using constructors.
As creating constructor with each combination is not possible, also it may be possible that

SOLUTION 1:
Use a Helper class, with same set of parameters and create an object of it.
After creating the object of Helper class, pass the helper object to main-class.

SOLUTION 2:
Create a getHelper() function inside Student-class, which will return object of helper class.
So, create the object in psvm() of helper-class by using getHelper() function in Student-class.
StudentHelper studentHelper = new Student().getHelper();

SOLUTION 3:
Set the values of a object using CHAINING-METHOD.
So, instead of setting the value one by one, Chaining method said that while creating the object of class,
set the values of that object at same time to avoid calling the same object again and again.

SOLUTION 4:
Use a build() method, which is created inside Helper-class.
build() will return the object of main-student-class.


BASICALLY, BUILDER DESIGN PATTERN HELPS TO CREATE THE OBJECT OF A CLASS, IN SUCH A WAY THAT USER SET THE
REQUIRED VALUES STEP BY STEP WITH CHAINING METHOD.....