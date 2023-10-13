/*
Constructor :

    1. A special method that is used to initialize some values during object creation is called a constructor.

    2. It is called every time when an object is created with new() keyword.
    
    3. In absence of constructor in the code, the Java compiler calls a default constructor and assign default values, 
       such as 0, null, etc. to the integer and object respctively. 

    4. Constructors can be used to call a method, create and assign values to an object, and start a thread. 

    5. The constructos name must be indentical to class's name.

    6. Constructors mustn't return any values not even void.

    7. Accesses modifiers in a constructor : 
        a. public            -> can be accessed from inside and outside the class, commonly used 
        b. private           -> can only be accessed within the same class
        c. protected         -> can be accessed within the class and it's subclasses 
        d. default           -> can be accessed within the same package, in absence of access specifier it will be considered default

    8. Types of constructors in Java:
        a. Default Constructor          -> has no parameters, used by compiler in absence of constructors in code 
        b. Parameterized Constructor    -> has parameters
        c. Copy Constructor             -> copy data to newly created object from existing ones

    

    Syntax of default constuctor :

         AccessModifier ClassName {

            // assign values here 

        }

*/

class Calc {
    int a, b;
    
    Calc() {             // default constructor is created here 
        a = 5;
        b = 10;  
        System.out.println("Constructor is called : "); 

    }

    int add() {
        return a + b ;
    }
}

class Constructor1 {
    public static void main(String[] args) {
        
        Calc c1 = new Calc();

        int c = c1.add();

        System.out.println("The total sum is : " + c);
    }
}

