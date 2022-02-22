package leetcode;

import java.util.Scanner;

public class Test029 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().substring(2);
        char[] chars = string.toCharArray();
        double calTemp = 0;
        double tempCase = 0;
        for (int i = 0 ; i < chars.length; i ++){
            calTemp = Math.pow(16, chars.length - 1 - i)*getNum(chars[i]);
            tempCase = calTemp + tempCase;
        }
        System.out.println((int) Math.ceil(tempCase));
    }
    public static int getNum(char t){
        int temp = 0;
        switch (t){
            case 'A': temp = 10; break;
            case 'B': temp = 11; break;
            case 'C': temp = 12; break;
            case 'D': temp = 13; break;
            case 'E': temp = 14; break;
            case 'F': temp = 15; break;
            case 'a': temp = 10; break;
            case 'b': temp = 11; break;
            case 'c': temp = 12; break;
            case 'd': temp = 13; break;
            case 'e': temp = 14; break;
            case 'f': temp = 15; break;
            case '0': temp = 0; break;
            case '1': temp = 1; break;
            case '2': temp = 2; break;
            case '3': temp = 3; break;
            case '4': temp = 4; break;
            case '5': temp = 5; break;
            case '6': temp = 6; break;
            case '7': temp = 7; break;
            case '8': temp = 8; break;
            case '9': temp = 9; break;
        }
        return temp;
    }
}
