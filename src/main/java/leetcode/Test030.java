package leetcode;

import java.util.Scanner;

public class Test030 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long temp = scanner.nextLong();
        int index = 2;
        StringBuilder stringBuilder = new StringBuilder();
        while (index <= temp){
            if(temp % index == 0){
                temp = temp / index;
                stringBuilder.append(index).append(" ");
            }else {
                index++;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
