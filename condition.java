// To print equivalent day of a number 


class condition{
    public static void main(String[] args){   
             
        int num = 3;

        switch(num){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("It's 2023 !");

        }
    }
}

/* 

This is the new version of Switch Statement introduced in Java 12.
We can also return values by executing some expressions.

*/