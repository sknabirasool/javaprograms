
package Threads;
public class ThreadPr extends Thread{
public void run()
{
System.out.println("Thread priority is"+Thread.currentThread().getPriority());
}
public static void main(String[] args) {

ThreadPr p1=new ThreadPr();
ThreadPr p2=new ThreadPr();
ThreadPr p3=new ThreadPr();

p2.setPriority(Thread.MIN_PRIORITY);
p1.setPriority(Thread.MAX_PRIORITY);
p3.setPriority(Thread.NORM_PRIORITY);
p1.start();
p2.start();
p3.start();
}
}
