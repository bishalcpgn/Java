/*

Lamda Function : 
     
    1. Lamda function can only be used with functional interfaces.

    2. We don't need to redefine abstract method during implementation so, it saves our time.  

    3. Functional interface is an interface with a single abstract method.

    4. Java provides an anotation `@FunctionalInterface`, which is used to declare an interface as functional interface.

    5. Lambda expression is treated as a function, so compiler does not create `.class` file.

    6. Lamda Function can have 0, single or multiple parameters and return values.

*/


@FunctionalInterface
interface calculator {

    void sum(int a, int b);

}

class LamdaFunction {

    public static void main(String[] args) {

        /*  
        
            // Implementing interface using anonymous class without lamda function 

            calculator cal = new calculator() {

                public void sum(a,b) {                   

                    System.print.ln("The sum is "+ (a+b));
                    
                }

            }   

        */
    
    // Using lamda function 

    calculator cal = (a,b) -> System.out.println("The sum is "+ (a+b));

    cal.sum(5,6);

    }

}