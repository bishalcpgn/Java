/*
Anonymous Inner class with Abstract class : 

    1. Refer Abstraction1.java file to know about Abstract class.

    2. Refer NestedClass3.java file to know about Anonymous inner class.

    3. We can define methods of Abstract class in Anonymous class.

    4. Note, that we making object of Anonymous class and Abstract class can't be instantiated.

    5. Use of anonymous class removes the burden of making extra class to use Abstract class.



*/


abstract class Calculator {                              // Abstract class  

    abstract double area(double radius);                 // Abstract method is declared only

}


class NestedClass4 {

    public static void main(String[] args) {

        Calculator Cal = new Calculator() {                // Anonnymous Inner Class 

            double area(double radius) {                   // // Abstract method is defined here 

                return ( 3.14 * radius * radius );

            }

        };

        double result = Cal.area(5.5);

        System.out.println(result);

    }
}