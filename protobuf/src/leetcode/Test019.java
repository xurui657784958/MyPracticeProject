package leetcode;

import java.util.Random;

public class Test019 {

    public static void main(String[] args){
        int m = 3, n= 5;
        new Test019().random(m,n);
    }

    public void random(int m, int n){
        Random rand = new Random();
        int temp = n;
        int[] sum = new int[m];
        for(int k = 0, g = 0; k < m - 1; k++){
            if(temp - 1 == 0){
                System.out.println(g);
                sum[k] = g;
            }else {
                g = rand.nextInt(temp-1) + 1;
                temp -= g;
                System.out.println(g);
                sum[k] = g;
            }
        }
        System.out.println(getSum(sum));
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
