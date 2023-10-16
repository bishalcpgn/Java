/*

Refer Threads1.java file for notes. 

Creating threads implementing interface :

    1. We can create threads by implementing `Runnable` interface and defining run() method.

    2. This is more preferred method as we can achieve multiple inheritance.

    3. To start a thread we must call start() method which is inherited from `Runnable` interface.

    4. Now, we have to pass the instance of Runnable into Thread class as a constructor.

    5. Finally, we can start threads using start() method inherited from `Thread` class.

    5. The Thread class manages the execution of the run() method defined in the Runnable class.

    6. `Thread` class used for creating threads also implements `Runnable` interface.

        Syntax : 

            class <ClassName> implements Runnable {

                public void run() {

                    // Your code here 
                    
                }
            }

    
*/


class GoodMorning implements Runnable {

    public void run() {                 // overriding run method 

        for(int i=1; i<1500; i++) {

            System.out.println(i + " Good Morning " );
        }
    }

}

class GoodAfternoon implements Runnable {

    public void run() {                   //overriding run method 

        for(int i=1; i<1500; i++) {

            System.out.println(i + " Good Afternoon " );
        }
    }

}


public class Threads2 {

    public static void main(String[] args) {

        GoodMorning gm = new GoodMorning();

        GoodAfternoon ga = new GoodAfternoon();

        Thread th1 = new Thread(gm);                // Thread class is imported by default 

        Thread th2 = new Thread(ga);

        th1.start();             

        th2.start();

    }
}


