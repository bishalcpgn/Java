// To find greatest number using IF ELSE IF in java 
 
public class Conditions1{
    public static void main(String[] args){
        float num1 = 1.0f; // float num1 = (float) 1.0;        
        float num2 = 2.2f;
        float num3 = 3.3f;

        if(num1>num2 && num1>num3){
            System.out.println("The greatest number is : "+num1);
        }

        else if(num2>num1 && num2>num3){
            System.out.println("The greatest number is : "+num2);
        }

        else{
            System.out.println("The greatest number is : "+num3);
        }

    }
}

/*

By default, Java treats any decimal or float numbers as double type, so in case,
if we want to define any value as float, we need to manually typecast it using the
'f' or 'F' keyword in the suffix of the number. 

*/
