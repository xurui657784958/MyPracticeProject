package util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @author edward
 */
public class CountDownLatchTest {
    public static void main(String[] args){
        //CountDownLatch downLatch = new CountDownLatch(1);
        for (int i = 0; i < 1000 ; i++){
            System.out.println("test1 - "+i);
        }

        new Thread(()->{
            /*try {
                downLatch.await(4, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            /*try {
                //Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            for (int i = 0; i < 1000 ; i++){
                System.out.println("test1 - "+i);
            }
            //downLatch.countDown();
        }).run();

        new Thread(()->{
            for (int i = 0; i < 1000 ; i++){
                System.out.println("test2 - "+i);
            }
        }).run();
    }
}
