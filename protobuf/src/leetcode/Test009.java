package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test009 {
    public static void main(String[] args){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i < 10000 ; i++){
            int finalI = i;

            new Thread(() -> {
                map.put(Integer.valueOf(finalI), Integer.valueOf(finalI));
            }).start();
        }
        System.out.println(map);
    }

}
