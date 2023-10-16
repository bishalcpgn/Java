/*

Threads :

    1. Thread is the smallest unit of execution within a process. 

    2. A process is divided into multiple subprocess/threads for resource management, multitasking with parallelism and further.
    
    3. Threads within the same process share the same memory space and resources and are lighter-weight.
    
    3. A thread has different stages in it's lifecycle (New, Runnable, Running, Waiting and Terminating).

    4. Threads can have different priorities which influence their scheduling. We can explicitly provide thread priorities.  
    
    5. We can create threads in java either by extending `Thread` class or implementing `Runnable` interface.


Creating threads by extending class :

    1. Here, extend we `Thread` class and override its run() method. 

    2. To start a thread we must call start() method which is inherited from `Thread` class. 

    3. Thread class is part of the java.lang package, which automatically imported. 

        Syntax : 

            class <ClassName> extends Thread {

                public void run() {

                // Override the method here 

                }
            }
            
*/

class GoodMorning extends Thread {

    public void run() {                 // overriding run method 

        for(int i=1; i<1500; i++) {

            System.out.println(i + " Good Morning " );
        }
    }

}

class GoodAfternoon extends Thread {

    public void run() {                   //overriding run method 

        for(int i=1; i<1500; i++) {

            System.out.println(i + " Good Afternoon " );
        }
    }

}


public class Threads1 {

    public static void main(String[] args) {

        GoodMorning gm = new GoodMorning();

        GoodAfternoon ga = new GoodAfternoon();

        gm.start();             // inherited from `Thread` class 

        ga.start();

    }
}