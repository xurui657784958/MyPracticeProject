package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test011 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println(new Test011().restoreIpAddresses(str2));
        }
        scan.close();
    }

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        restore(s, 4, "", res);
        return res;
    }

    public void restore(String s,int k,String out,List<String> res) {
        if(k==0) {
            if(s.isEmpty()) {
                res.add(out);
            }
        }else {
            for (int i = 1; i <= 3; ++i) {
                if(s.length() >= i && isValid(s.substring(0,i))) {
                    if(k==1) {
                        restore(s.substring(i), k-1, out+s.substring(0,i), res);
                    } else {
                        restore(s.substring(i), k-1, out+s.substring(0,i)+".", res);
                    }
                }
            }
        }
    }

    //校验函数：主要验证 每段数字是否为 001 022 等这样0开头的数字
    public boolean isValid(String s) {
        if(s.isEmpty() || s.length()>3 || (s.length()>1 && s.charAt(0)=='0')){
            return false;
        }else {
            int resInt = Integer.parseInt(s);
            return resInt<=255 && resInt>=0;
        }
    }
}
