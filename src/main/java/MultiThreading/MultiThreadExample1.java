package MultiThreading;

public class MultiThreadExample1 {

    public static void main(String[] args) {
        //Create different tasks
        RunnableTask task1 = new RunnableTask(0, "FirstMessage");
        RunnableTask task2 = new RunnableTask(500, "SecondMessage");
        RunnableTask task3 = new RunnableTask(1000, "ThirdMessage");

        //Must initialise a thread for each task we want to run
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        //Must start up each thread
        thread1.start();
        thread2.start();
        thread3.start();

//        System.out.println("??");
    }

}
