package leetcode;

import java.util.Scanner;

public class Test026 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String longString = scanner.nextLine();
        String shortString = scanner.nextLine();
        char[] temp = longString.toCharArray();
        char[] temp2 = shortString.toCharArray();
        char temp3 = Character.isUpperCase(temp2[0]) ? temp2[0] : Character.toUpperCase(temp2[0]);

        int i = 0;
        for (char c : temp){
            char temp4 = Character.isUpperCase(c) ? c : Character.toUpperCase(c);
            if (temp4 == temp3){
             i++;
             i = 0;
            }
        }
        System.out.println(i);
    }
}
