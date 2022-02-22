package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test000 {
    public static void main(String[] args){
         List<Integer> tempInt = new ArrayList<Integer>();
         List<String> tempSring1 = new ArrayList<String>();

         String[] tempString = new String[]{"4","5","6"};
         int[] temp = new int[]{43,42,53,55,67};

         for (int i : temp){ tempInt.add(i);}
         for (String string :tempString){ tempSring1.add(string);}



         /*Map<Integer,String> map = new ConcurrentHashMap<Integer, String>(4);
         map.entrySet().parallelStream().forEach(o ->{
             map.put()
         });*/
    }
}
