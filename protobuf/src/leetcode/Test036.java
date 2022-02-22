package leetcode;

import java.util.Scanner;

public class Test036 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        StringBuffer result = new StringBuffer();
        string1 = new StringBuilder(string1).reverse().toString();
        string2 = new StringBuilder(string2).reverse().toString();
        int length1 = string1.length();
        int length2 = string2.length();
        int maxLen = length1 > length2 ? length1:length2;
        int nTakeOver = 0;
        if (length1<length2){
            for (int i = length1; i < length2; i++){
                string1 += "0";
            }
        }else if(length1 > length2){
            for (int i = length2; i < length1; i++){
                string2 += "0";
            }
        }
        for(int i=0; i<maxLen; i++) {
            int summary = Integer.parseInt(string1.charAt(i) +"") + Integer.parseInt(string2.charAt(i) +"")+ nTakeOver;
            nTakeOver = 0;
            if(i < (maxLen - 1)) {
                if(summary >= 10) {
                    nTakeOver = 1;
                    result.append(summary - 10);
                }else {
                    nTakeOver = 0;
                    result.append(summary);
                }
            }else {
                StringBuffer lastSum = new StringBuffer();
                lastSum.append(summary).reverse();
                result.append(lastSum);
                result.reverse().toString();
            }
        }
        System.out.println(result.toString());
    }
}
