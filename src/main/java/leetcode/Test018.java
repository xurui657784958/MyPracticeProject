package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test018 {

    public static void main(String[] args){
        int[] test = {1,2,3};
        System.out.println(new Test018().getSubAns(test));
    }

    private List<List<Integer>> getSubAns(int[] testNums){
        List<List<Integer>> rt = new ArrayList<>();
        int length = testNums.length;
        int range = (int)Math.pow(2,length);
        for (int i = 0; i < range; i++){
            String str = Integer.toBinaryString(i);
            int test = length - str.length();
            List<Integer> temp = new ArrayList<>();
            for (int j = str.length() -1 ; j >= 0; j--){
                if(str.charAt(j) == '1'){
                    temp.add(testNums[j + test]);
                }
            }
            rt.add(temp);
        }
        return rt;
    }

}
