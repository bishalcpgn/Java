/*

Refer Abstraction1.java file to learn about Abstraction.

Abstraction using Interfaces : 

    1. Interface is a way for obtaining abstraction. 

    2. Interface is a collection of abstract methods and constants. It is a blueprint of a  class.
    
    3. It is defined by a keyword `interface`.

    4. By default, methods in interface are abstract and public whereas constants are public, static and final. 

    5. As the methods are abstract, they do not have a body and are defined in a class that implements an interface.

    6. A class that implements an interface must implement all the methods declared in the interface.

    7. Multiple Inheritance can be achived by interfaces which isn't possible incase of class.

    8. An interface cannot contain a constructor (as it cannot be used to create objects as like abstract class). 


Syntax : 

    interface <InterfaceName> {  
      
        // declare  constant fields and abstract methods here   
    
    }  

    class <ClassName> implements <InterfaceName> {

        // define methods here 

    }


*/

interface Calculator {

    void sum();                                                 // Methods are abstract and public by default.

    void addition();

}

class AdvancedCalculator implements Calculator {

    public void sum() {                                          // Methods must be public

        System.out.println("Sum method is defined.");

    }

    public void addition() {

        System.out.println("Addition method is defined.");

    }

}

class Abstraction2 {
    
    public static void main(String[] args) {

        AdvancedCalculator AdvCal = new AdvancedCalculator();       // Create object of class, not of interface 

        AdvCal.sum();

        AdvCal.addition();

    }

}