package leetcode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(new Test013().convert(num));
    }

    public String convert(int num){
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(num);
    }
}
