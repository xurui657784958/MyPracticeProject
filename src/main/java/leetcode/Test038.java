package leetcode;

public class Test038 {

    /*
    * 数组有序，查找某个数字的出现的次数
    * */
    //找出第一个查找的数字的位置
    public int getFirstIndex(int[] array, int num, int start, int end){
        if (start > end){
            return -1;
        }
        int middle = (start + end)/2;
        int miData = array[middle];
        if (miData == num ){
            if ((middle >0 && array[middle - 1]!=num)||middle == 0){
                return middle;
            }else {
                end = middle - 1;
            }
        }else if (miData > num){
            end = middle - 1;
        }else {
            start = middle + 1;
        }
        return getFirstIndex(array,num,start,end);
    }

    /*
    * 找出最后一个查找的数字的位置
    * */

    public int getLastIndex(int[] array, int num, int start, int end){
        if (start > end){
            return -1;
        }
        int middle = (start + end)/2;
        int miData = array[middle];
        if (miData == num ){
           if ((middle < array.length - 1 && array[middle + 1]!=num)||middle == array.length -1){
               return middle;
           }else {
               start = middle +1;
           }
        }else if (miData < num){
            start = middle + 1;
        }else {
            end = middle - 1;
        }
        return getLastIndex(array,num,start,end);
    }

    /*
    * 接受传入数组和查找元素
    * */
    public int getNUM(int[] array, int num){
        int temp = 0;
        int length = array.length;
        if(array != null && length > 0){
            int first = getFirstIndex(array, num, 0, length -1);
            int last = getLastIndex(array,num,0,length-1);
            if (first > -1 && last > -1) {
                temp = last -first +1;
            }
        }
        return temp;
    }
    public static void main(String[] args){
             int[] ints = new int[]{
                    1,4,4,4,4,4,5,
                     1,4,5,
                     4,4,5,5,
                     4,4,5,6,
             };
             System.out.println(new Test038().getNUM(ints,6));
    }



    /*tail catalina.out|grep -C ERROR
            cat error.log | grep "error"
    cp  */

    public int f(int n){
        if(n <= 2){
            return 1;
          }
        else {
            return f(n -1) +f(n -2);
        }

    }


    /*
    * 新电影：15    老 10；    卡 8
    *
    * */
    interface S{
        public static final int LAO = 15;

    }
}
