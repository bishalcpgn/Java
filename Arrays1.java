/* Arrays are used to store multiple values in a single variable in a contiguous memory each identified by an index or a key. 

Declaring an array :
    1. int numbers[];
    2. int[] numbers;      More preferred
    Here, no memory is been allocated to the array as the size is unknown.

Initializating an array :
    1. int[] numbers = new int[10];
    This allocates the memory for an array of size 10. This size is immutable.
    The default value of array is 0 for integers, false for booleans, null for objects and so on.    

We can declare and initialize the array simultaneously using curly brackets {} which contains elements. 
    1. int[] numbers = {1, 4, 8};
    Creates and initialize an array of size 3.

    We can perform same operation using new keyword too.
    1. int[] numbers = new int[]{2, 0, 3};

Notes : 
    1. If we're creating a method that returns an initialized array, we must use the new keyword. 
    2. We can use classes like IntStream, DoubleStream and LongStream to assign range of values in array.


*/

public class Arrays1{
    public static void main(String[] args){
        
        int[] numbers = { 1, 2, 3, 4, 5 }; // Declare and initialize an integer array

        numbers[2] = 10; // Modify an element in the array   

        // Print elements of the array
        System.out.println("Elements of array are :");
        for (int i = 0; i < numbers.length; i++) // Since there is only one statement {} can be omitted.
            System.out.println("Element at index " + i + ": " + numbers[i]);
        

        // Calculate the sum of elements in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) 
            sum += numbers[i];
        
        System.out.println("Sum of elements: " + sum);
    }
}


    
