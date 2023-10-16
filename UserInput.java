/*

User Input Using Scanner :

    1. The easiest way to get user input in Java is by using Scanner class.
    
    2. It is found in the `java.util` package so, we have to import the pacakage before using Scanner class.

    3. To use scanner class, we have to make its object and pass available methods to specify the input source.
    
    4. So, basically we are creating an object and initializing it by passing available methods like `System.in`.


*/

import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {

        System.out.println("Enter your name : ");

        Scanner scanner = new Scanner(System.in);  // `System.in` is used to specify input from the console / keyboard

        String name = scanner.nextLine(); // nextLine() reads characters until it encounters a newline character ('\n') and then returns the collected characters as a string.

        System.out.println("Hello "+ name);

        scanner.close();

    }
     

}