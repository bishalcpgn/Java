/* 

Static Inner Class ( Static Nested Class )  

    1. They are declared as a static member of an outer class.   

    2. We can access static inner class without making instance of outer class.

    3. Static inner class can only access static members of the outer class.

    4. To access non-static members, we need instance of a class. 


    
        Syntax for defining : 

            public class OuterClass {

                // features 

                static class InnerClass {

                    // features 

                }
            }


        Syntax for accessing  :                    

            OuterClass.InnerClass IC = new OuterClass.InnerClass();





*/


class Calculator {                  // Outer class 

    static int a = 1 ;
    static int b = 5 ;

    static class Sum {               // static inner class 

        void show() {

            System.out.println("The sum of static variables of outer class 'Calculator' is : " + (a+b));

        }

    }
}

public class NestedClass2 {

    public static void main(String[] args) {

        Calculator.Sum s1 = new Calculator.Sum();    

        s1.show();

    }
}