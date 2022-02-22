package leetcode;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test005 {

    /*public static void main(String[] args){
        //缓存线程池
        long current = System.currentTimeMillis();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i < 100; i++){
            int finalI = i;
            executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName() + "执行"+ finalI+":"+ new Date(System.currentTimeMillis()));
            });
        }
        executorService.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("1_time : "+ (end-current));

        long curren1 = System.currentTimeMillis();
        for (int i = 1; i < 100 ; i++){
            System.out.println(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("2_time : "+ (end1-curren1));
        new ThreadPoolExecutor()
    }*/
}
