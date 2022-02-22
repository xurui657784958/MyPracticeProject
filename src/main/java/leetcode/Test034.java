package leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class Test034 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int len = 0;
        int strLength = string.length();
        int i=0;
        int j=0;
        HashSet<Character> hs = new HashSet<Character>();
        while (i < strLength && j <strLength){
            if(!hs.contains(string.charAt(j))){
                hs.add(string.charAt(j++));
                len = Math.max(len,j-i);
            }else {
                hs.remove(string.charAt(i++));
            }
        }
        System.out.println(len);
    }
}
