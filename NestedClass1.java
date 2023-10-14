/* 

 Nested  Class : 

    1. Nested  class is the class which is defined inside another class.

    2. We can access private members of outer class using inner class. 


Types of Nested Class :

    1. Inner Class ( Non-static Nested Class )         ->   created within class and outside method

    2. Static Inner Class ( Static Nested Class )      ->   declared with static keyword 

    3. Local Inner Class                               ->   declared within a method of a class 

    4. Anonymous Inner Classes                         ->   declared without any name at all



Inner Class ( Non-static Nested class )

    1. Inner class can be public, protected or private.

    2. To acces inner class, we have to create an object of the outer class, and then create an object of inner class.

    
        Syntax for defining : 

            public class OuterClass {

                // features 

                public class InnerClass {

                    // features 

                }
            }


        Syntax for accessing  : 

            Outerclass OC = new OuterClass();

            OuterClass.InnerClass IC = OC.new InnerClass();





*/


class Calculator {

    private int a = 1 ;
    private int b = 5 ;

    public class Sum {

        void show() {

            System.out.println("The sum of private variables of outer class 'Calculator' is : " + (a+b));
        }

    }
}

public class NestedClass1 {

    public static void main(String[] args) {

        Calculator Cal = new Calculator();

        Calculator.Sum s1 = Cal.new Sum();

        s1.show();

    }
}