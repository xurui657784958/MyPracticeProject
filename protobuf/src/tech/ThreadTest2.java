package tech;

public class ThreadTest2 extends Thread {
    public void run() {
        //此处为thread执行的任务内容
        System.out.println(Thread.currentThread().getName());
    }
}
