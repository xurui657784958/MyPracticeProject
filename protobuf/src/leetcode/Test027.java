package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test027 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sTemp = scanner.nextInt();
        int i = 0;
        int[] ints = new int[sTemp];
        while (scanner.hasNext()){
            ints[i] = scanner.nextInt();
            i++;
            if (i == sTemp) {
                break;
            }
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int j = 0;
        for (int b : ints){
            hashMap.put(b,0);
        }
        Set<Integer> set = hashMap.keySet();
        int[] ints1 = new int[set.size()];
        int k = 0;
        for (Integer integer : set){
            ints1[k] = integer.intValue();
            k++;
        }
        Arrays.sort(ints1);
        for (int m :ints1){
            System.out.println(m);
        }

    }
}
