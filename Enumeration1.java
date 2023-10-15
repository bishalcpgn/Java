/*  

Enumeration : 

    1. An Enum, short for Enumeration is a User-Defined data type that contains a set of pre-defined constant values separated by commas.

    2. These pre-defined constant values can be used at the compile time of a program.

    3. Constants should be in UPPER case according to naming convention.

    4. Enum constants are public, static and final (cannot be overridden and changed).

    5. Enum can't extend any class because it internally extends `Enum` class.

    6. But, Enum can implement any number of interfaces.

    7. Enum constants have initial values starting from 0 according to their index but we can assign them explicitly too.

    8. The instance of Enum class is created automatically so, additional instances cann't be created uisng `new` keyword.

    9. The constants defined within an Enum are instances of that class.

    10. Enum can be used with loops and conditional statements like for, if else and switch case.


*/

enum ColorBox {                 // ColorBox is a class 

    RED, BLUE, WHITE ;          // Constants are ColorBox objects here 


}

public class Enumeration1 {

    public static void main(String[] args) {

        System.out.println("The constant with their initial values are : ");

        for (ColorBox c : ColorBox.values()) {              // As ColorBox is a class, it has some methods by default.

            System.out.println(c + " " + c.ordinal() );     // Prints constants with their values

        }
       
              
    }
}
