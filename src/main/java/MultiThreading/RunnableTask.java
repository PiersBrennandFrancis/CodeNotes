package MultiThreading;

public class RunnableTask implements Runnable{

    private long prePause;
    private String postMessage;

    public RunnableTask(long prePause, String postMessage){
        this.prePause=prePause;
        this.postMessage=postMessage;
    }

    public void run(){
        try
        {
            Thread.sleep(prePause);
            System.out.println(postMessage);
        }
        catch(InterruptedException e)
        {
            System.out.println("my thread interrupted");
        }
    }
}