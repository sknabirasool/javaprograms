package Threads;

public class ThreadRunnable implements Runnable{
public void run()
{
System.out.println("Thread is running1");
}
public static void main(String[] args) {

  
Thread t=new Thread(new ThreadRunnable());

Runnable t2 = new ThreadRunnable();   
t.start();

t2.run();
}
}
