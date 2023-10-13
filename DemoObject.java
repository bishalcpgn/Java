// A class to accept values and return their sum  

public class DemoObject{
    public static void main(String[] args){
        int num1 = 4;
        int num2 = 6;        
        calculator calc = new calculator(); // Making object of class calculator
        int result = calc.add(num1, num2);
        System.out.println("Total sum : "+result);
    
    }
}

class calculator{
    public int add(int num1, int num2){
        int sum = num1 + num2;        
        return sum;
    }
}
