/* 

    Refer Inheritance1.java file for notes about Inheritance.

    Refer Abstraction2.java file for notes about Interfaces. 
    
     
    Multiple Inheritance :

        1. It is a type of inheritance where a class can inherit properties of more than one parent class.

        2. Java doesn't support multiple inheritance using class.   

        3. Multiple Inheritance can be achieved with Interfaces.

        4. A class / interface can be inheritance from multiple interfaces.

    
    Syntax to show a interface extending multiple interfaces : 


        interface <InterfaceName1> {
            
            void method1();
    
        }

        interface <InterfaceName2> {
            
            void method2();

        }
        
        interface <InterfaceName3> extends <InterfaceName1> , <InterfaceName2> {           // Interface3 extends both Interface1 and Interface2
            
            void method3();
        }

        class <ClassName> implements <InterfaceName3> {
           
            // Override Methods here 
           
        }
        

    Syntax to show a class implementing multiple interfaces : 

        interface <InterfaceName1> {
            
            void method1();
    
        }

        interface <InterfaceName2> {
            
            void method2();

        }
        
        

        class <ClassName> implements <InterfaceName1>, <InterfaceName3> {
           
            // Override Methods here 
            // Methods must be declared as public
           
        }


*/

interface NormalCalculator {

    void sum();

}

interface ScientificCalculator {

    void divide();

}

class AdvancedCalculator implements NormalCalculator, ScientificCalculator {

    public void sum() {

        System.out.println("This is sum.");
    }

    public void divide() {

        System.out.println("This is divide.") ;
        
        }        
    
}

class Inheritance3 {

    public static void main(String[] args) {

        AdvancedCalculator Ac = new AdvancedCalculator();

        Ac.sum();

        Ac.divide();

    }

}





