// Method Overloading
// 1. Multiple methods in a class can have same name but different parameters and datatypes. 
// 2.  We can call these method based on the number or type of arguments passed to it though they have a common name.

class calculator{
    public int add(int num1, int num2){  // Accepts two integer values
        int sum = num1 + num2;        
        return sum;
    }

    public double add(double num1, double num2){  // Accepts two double values
        double sum = num1 + num2;        
        return sum;
    }

    public double add(int num1, double num2){ // Accept a integer and a double value
        double sum = num1 + num2;        
        return sum;
    }
}



public class MethodOverloading{
    public static void main(String[] args){               
        calculator calc = new calculator(); // Making object of class calculator
        int result1 = calc.add(1,2); // Passing two integer values
        double result2 = calc.add(1.5,0.2); // Passing two double values
        double result3 = calc.add(1,2.9);   // Passing a integer and a double value
        System.out.println("Sum : "+result1);
        System.out.println("Sum : "+result2);
        System.out.println("Sum : "+result3);
    
    }
}

