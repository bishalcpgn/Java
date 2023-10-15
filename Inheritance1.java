/* 
Inheritance :

    1. One of the important features of OOP, where features of one class can be transferred to next one.

    2. The `extends` keyword is used for inheritance in Java. 

    3. Every class implicitly extends the `java.lang.Object` class by default (except child class).

    4 . Private members and constructor can't be inherited.

    5. Use `extends` keyword for class to class and interface to interface inheritance.

    6. Use `implement` keyword for interface to class inheritance. 

    7. Types of inheritance :
        a. Single Inheritance          ->     a class is derived from only one super/parent class
        d. Multilevel Inheritance      ->     a subclass is derived from another subclass forming a chain like structure 
        c. Multiple Inheritance        ->     a interface can be derived from multiple interfaces, Java does not support multiple inheritances with classes. 
        d. Hierarchical Inheritance    ->     multiple subclasses can be derived from a single superclass
        e. Hybrid Inheritance          ->     mix of two or more types of inheritance, can be achived using interfaces


    Syntax for Single Inheritance : 

        class ChildClass extends SuperClass {  

            // Extra Features 

        }  


*/

class Calculator {

    String add(int a , int b) {

        return ("Addition : "+ (a + b)) ; 
    }

}

class AdvanceCalculator extends Calculator {

    String sub(int a , int b) {

        return ("Subtraction  : " + (a - b)) ; 
    }

}


class Inheritance1 {
    public static void main(String[] args) {

        AdvanceCalculator c1 = new AdvanceCalculator();

        String result1 = c1.add(5,6);

        String result2 = c1.sub  (5,6);

        System.out.println(result1 + " " + result2);

    }
}
