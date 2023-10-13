/*

    Check Constructors.java file for notes. 

    Syntax of parameterized constuctor :

         AccessModifier ClassName( parameters ) {

            // assign values here 

        }

    For invoking :

        ClassName object = new ClassName( arguments );




*/

class Calc {
    int a, b;
    
    Calc(int x , int y ) {             // parameterized constructor is created here 
        this.a = x;
        this.b = y;  
        System.out.println("Constructor is called : "); 

    }

    int add() {
        return a + b ;
    }
}

class Constructor2 {
    public static void main(String[] args) {
        
        Calc c1 = new Calc(5, 10); // invokes constructor 

        int c = c1.add();

        System.out.println("The total sum is : " + c);
    }
}

