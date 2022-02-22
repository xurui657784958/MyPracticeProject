package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test023 {
    public static void main(String[] args) {
        int n = 1000;
        boolean []test = new boolean[1000];
        Arrays.fill(test, true);
        int peopleCount = 1000;
        int count = 0; int j = 0;
        while(peopleCount > 1){

            if(test[j]){
                count ++;
                int k = 0;
                if(count == 3){
                    k++;
                    count = 0;
                    test[j] = false;
                    peopleCount--;
                    if(k == 3){
                        test[j] = true;
                    }
                }
            }
            j++;
            if(j == 1000){
                j = 0;
            }
        }
        for (int a = 0; a < 1000; a++){
            if(test[a]) {
                System.out.print("第几号："+ (a+1) +"留下");
            }
        }
    }
}
