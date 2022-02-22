package tech;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadStart {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       /*Thread thread = new Thread(new ThreadTest());
       thread.start();*/
       new ThreadTest2().start();
       new Thread(new ThreadTest2()).start();
       new Thread(new ThreadTest()).start();
       new Thread(()->{
           System.out.println("Thread Hello World");
       }).start();

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new CallableTest());
        new Thread(futureTask,"A").start();
        Integer integer = (Integer)futureTask.get();
        System.out.println(integer);
    }
}
