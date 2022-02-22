package leetcode;

public class Test037 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] test = new int[]{
                3,4,-1,1
        };
        System.out.println(Test037.findFirstPositive(test));
    }

    public static int findFirstPositive(int[] array){
        int n = array.length;
        for(int i = 0; i < n ; i++){
            while(array[i] > 0 && array[i] < n && array[array[i] - 1] != array[i]){
                int temp = array[array[i] - 1];
                array[array[i] - 1] = array[i];
                array[i] = temp;
            }
        }
        int j = 0;
        for(int i = 0; i < n; i++){
            if(array[i] != i + 1){
                j = i;
                break;
            }
        }
        return  j + 1;
    }
}