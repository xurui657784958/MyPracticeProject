package leetcode;

import java.util.Scanner;

public class Test032 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if (N >= M){
            System.out.println("NA");
        }
        int i, j, k;
        for (i = N; i < M; i++){
            for (j = i + 1; j < M; j++){
                for (k = j + 1; k < M; k++){
                    if(k*k == i*i + j*j){
                        int s,r,t;
                        s = sushu(i,j);
                        r = sushu(i,k);
                        t = sushu(j,k);
                        if (s==1&&r==1&&t==1){
                            System.out.println(i+" "+j+" "+k);
                        }
                    }else {
                        System.out.println("\"NA\"");
                    }
                }
            }
        }
    }
    public static int sushu(int m ,int n){
        int k =m%n;
        while (k!=0){
            m=n;
            n=k;
            k=m%n;
        }
        return n;
    }
}
