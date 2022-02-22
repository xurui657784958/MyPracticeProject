package leetcode;

import java.util.Scanner;

public class Test025 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String stringTemp = scanner.nextLine();
    String[] temp = stringTemp.split(" ");
    String tempChar = temp[temp.length-1];
    System.out.println(tempChar.toCharArray().length);
}
}
