package Threads;

public class ThreadsClass extends Thread {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello from thread");
        System.out.println("HI");

        //old method for thread creation
        Runnable  newThread = new Runnable() {
            @Override

            //do something
            public void run() {
                System.out.println("Hi too");
            }
        };

        //get the name of a thread
        Thread mt = new Thread( r, "Thread One");
        System.out.println(mt.getName());

        //set the name of a thread
        Thread  t2 = new Thread(r);
        t2.setName("thread Two");
        System.out.println(t2.getName());



    }
}
