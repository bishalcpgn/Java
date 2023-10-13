/* 

    Check inheritance.java file for notes. 
    
     
    Syntax for Multilevel Inheritance : 


        class SuperClass {  

            //  Features 

        }  

        class ChildClass1 extends SuperClass {  

            // Extra Features 

        }  

        class ChildClass2 extends ChildClass1 {  

            // Extra Features 

        }  


*/

class Calculator {                          // Super Class 

    String add(int a , int b) {

        return ("Addition : "+ (a + b)) ; 
    }

}

class AdvanceCalculator extends Calculator {        // First Childclass 

    String sub(int a , int b) {

        return ("Subtraction  : " + (a - b)) ; 
    }

}

class AdvancedAdvanceCalculator extends AdvanceCalculator {        // Second Childclass 

    String mult(int a , int b) {

        return ("Multiplication  : " + (a * b)) ; 
    }

}



class inheritance2 {
    public static void main(String[] args) {

        AdvancedAdvanceCalculator c1 = new AdvancedAdvanceCalculator();

        String result1 = c1.add(5,6);

        String result2 = c1.sub(5,6);

        String result3 = c1.mult(5,6);

        System.out.println(result1 + " \n " + result2 + " \n " + result3);

    }
}