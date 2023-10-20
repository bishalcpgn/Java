/* 
Data Structure : 

    1. Data Structure is a way of storing, processing and retrieving data in a computer. 

    2. Data structure can be linear or non-linear. 

    3. Linear data structure        -->  data elements are sequentially arranged. Eg : Array, ArrayList, LinkedList, Stack, Queue 

    4. Non-linear data structure    -->  data elements are randomly arranged. Eg : Trees, Graphs, HashTables 



Collection API : 

    1. Collection API makes developer easier to work with various data structures.

    2. It is a group/framework of interfaces and classes that help to store and manipulate collection data.
    
    3. Collection data refers to the group of data/objects items stored as a single unit. 

    4. Collection API is found in `java.utils` package.

    5. Hierarchy of Collection framework : 


            [I] --> Interface 
            [C] --> Class 


                                    Iterable [I]
                                       |
                                       |
                                    Collection [I]
                                       |
        _______________________________|_______________________________                               | 
       |                               |                               |
       |                               |                               |
      List [I]                       Queue [I]                        Set [I]
       |                               |                               |
       |---- ArrayList [C]             |---- Deque [I]                 |----HashSet [C]
       |                               |                               |
       |---- LinkedList [C]            |---- PriorityQueue [C]         |----LinkedHashSet [C]



List Data Structure : 

    1. List is a type of linear data structure. 

    2. The size of list is dynamic and can be altered accordingly. 

    3. List can store elements of different data types. 

    4. `ArrayList` class is implemented as a dynamic array and can store multiple data types unlike array.

    5. We can make ArrayList of specific data type by using <>.

    6. We can use <Object> type to store multiple data types as objects.

    7. Then, we can use various methods for adding, removing and accessing elements in ArrayList.


Syntax for ArrayList : 

    import java.util.ArrayList;  

    ArrayList<DataType> ArrayListObject1 = new ArrayList<DataType>;




*/

import java.util.ArrayList;

class DataStructure1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding elements 
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Retriving elements 
        int num1 = numbers.get(0);
        int num2 = numbers.get(1);
        int num3 = numbers.get(2);

        // Deleting elements 
        numbers.remove(0);

        // Iterating through elements 
        System.out.println("The final values are : ");

        for(int n : numbers) {

            System.out.println(n);

        }


    }
}
