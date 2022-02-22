package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test020 {
    public static void main(String[] args){
        int m = 1000, n= 1000;
        int[] rt= new Test020().splitInteger(m,n,false);
        for (int i = 0; i < rt.length; i++){
            System.out.println(rt[i]);
        }
        System.out.println("sum : "+new Test020().getSum(rt));
    }

    public int[] splitInteger(int n, int sum,boolean flag) {
        //随机抽取n-1个小于sum的数
        List<Integer> list = new ArrayList();
        //将0和sum加入到里list中
        list.add(0);
        //判断生成的正整数集合中是否允许为0，true元素可以为0  false元素不可以为0
        if (!flag) {
            sum = sum - n;
        }
        list.add(sum);
        int temp = 0;
        for (int i = 0; i < n - 1 ; i++) {
            temp = (int) (Math.random() * sum);
            list.add(temp);
        }
        Collections.sort(list);
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = list.get(i + 1) - list.get(i);
            if (!flag) {
                nums[i] += 1;
            }
        }
        return nums;
    }

    public int getSum(int[] score){
        int i;
        int sum = 0;
        for (i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        return sum;
    }
}
