package leetcode;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test008 {
    private static final Integer notifyIntervalSeconds = 1;
    public void main1(){
        ScheduledExecutorService executorService = Executors
                .newSingleThreadScheduledExecutor(new ThreadFactoryBuilder()
                        .setNameFormat("ipsla-handler-main")
                        .setDaemon(true)
                        .build());
        this.init(executorService);

    }
    private void init(ScheduledExecutorService executorService){
        Map<Integer,Integer> map = new HashMap<>();
        executorService.scheduleWithFixedDelay(this::notifyNexthopStatus, 1, notifyIntervalSeconds, TimeUnit.MICROSECONDS);
    }

    private void notifyNexthopStatus(){
        System.out.println(new Date(System.currentTimeMillis()));
    }
}
