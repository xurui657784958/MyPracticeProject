package leetcode;

import java.util.Scanner;

public class Test028 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        while (string1.length()>=8){
            System.out.println(string1.substring(0,8));
            string1 = string1.substring(8);
        }
        if (string1.length() > 0){
            String stringTemp = "00000000";
            string1 = string1 + stringTemp;
            System.out.println(string1.substring(0,8));
        }
        while (string2.length()>=8){
            System.out.println(string2.substring(0,8));
            string2 = string2.substring(8);
        }
        if (string2.length()<8 && string2.length() > 0){
            String stringTemp = "00000000";
            string2 = string2 + stringTemp;
            System.out.println(string2.substring(0,8));
        }
    }
}
