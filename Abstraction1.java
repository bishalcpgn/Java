/*
Abstractraction : 

   1. Abstraction is a process of hiding unwanted contents and only showing relevant data to users.

   2. It is one of the important features of OOP.

   3. In Java, abstraction is achieved through abstract classes and interfaces.


Abstract Class :

    1. The class which are declared with abstract keyword is known as abstract class.

    2.  It can have both abstract and non-abstract methods.
    
    3. It cannot be instantiated on its own and often serves as a blueprint for other classes.So, we can't create its objects.


Abstract Method : 
    
    1. Abstract methods are the methods declared with abstract keyword. 

    2. They are followed by a semicolon instead of definition part.

    3. Abstract methods are declared in abstract classes or in interfaces.


*/


abstract class calculator {                              // Abstract method 

    abstract double area(double radius);                 // Abstract method is declared only. 

    void showOutput() {                                  // Non-Abstract method 

        System.out.println("This is a for a circle.");
    }
}

class AdvancedCalculator extends calculator {               // concrete class, declaration is done here 

    double area(double radius) {

        radius = radius; 

        return ( 3.14 * radius * radius );
    }
}


class Abstraction1 {

    public static void main(String[] args) {

        AdvancedCalculator ac = new AdvancedCalculator();

        ac.showOutput();

        double result = ac.area(5.5);

        System.out.println(result);

    }
}
