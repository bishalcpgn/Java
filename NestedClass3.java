/*

Annonymous Inner Class :

    1. It is an inner class without a name.It's name is decided by the compiler.

    2. It is commonly used for implementing interfaces or extending classes and overriding methods often for one-time use cases.

    3. It is inside an expression. 


Method Overriding using annonymous class :

    Syntax : 

        ClassName obj = new ClassName() {

            // Define method to override here 
        
        };

*/

class Calculator {              

    void show() {

        System.out.println("This is calculator.");

    }
    
}
              

public class NestedClass3 {

    public static void main(String[] args) {

    Calculator c1 = new Calculator() {

        void show() {

            System.out.println("This is implementation of anonymous class");

        }

    };
        
    c1.show();

    }

}
