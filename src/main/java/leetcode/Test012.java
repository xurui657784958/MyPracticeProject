package leetcode;

import java.util.Scanner;

public class Test012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(getResult(num));

    }
    public static String getResult(long num){
        int a = 2;
        String result = "";
        while(num != 1){
            while(num % a ==0){
                num = num / a;
                result = result + a +" ";
            }
            a++;
        }
        return result;
    }
}
