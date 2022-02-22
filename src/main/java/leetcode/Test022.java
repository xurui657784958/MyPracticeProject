package leetcode;

import com.google.protobuf.Int32Value;
import com.sun.tools.javac.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test022 {
    public static void main(String[] args){
        Integer[] array = new Integer[]{1, 51, 24, 72, 28, 99, 76, 25, 75, 81, 9, 2,
                89, 92, 49, 3, 17, 54, 48, 62, 34, 29, 52, 76, 28, 91, 91, 75, 72};
        Map<Integer,Integer> map = getMap(array);
        Set<Integer> keys = map.keySet();
        Object[] objects = keys.toArray();
        System.out.println(getMap(array).size()-getMap(objects).size());
    }
    public static <T> Map<Integer,Integer> getMap(T[] objects){
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i=0; i< objects.length; i++){
            for (int j = i + 1; j < objects.length; j++){
                if( (Integer) objects[i] + (Integer) objects[j] == 100){
                    map2.put((Integer) objects[i],(Integer) objects[j]);
                }
            }
        }
        return map2;
    }
}


