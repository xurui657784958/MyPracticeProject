package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Test033 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] stringsInt = string.split(" ");
        int[] array = new int[stringsInt.length];
        int j = 0;
        for (String string1 :stringsInt){
            array[j] = Integer.parseInt(string1);
            j++;
        }
    }
    public static int[] getNewAarry(int[] a){
        int[] b =  new int[a.length];
        Arrays.sort(a);
        if (a.length % 2 == 0){
            int j = 0 ;
            int k = 1 ;
            for (int i = 0; i < a.length/2; i++ ){
                b[j] = a[i];
                j = j + 2;
                b[k] = a[i + a.length/2];
            }
            return b;
        }else {
            int j = 0 ;
            int k = 1 ;
            for (int i = 0; i < a.length/2; i++ ){
                b[j] = a[i];
                j = j + 2;
                b[k] = a[i + a.length/2];
                k = k + 2;
            }
            return b;
        }
    }
}
