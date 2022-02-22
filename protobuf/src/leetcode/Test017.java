package leetcode;

public class Test017 {

    public static void main(String[] args){
        int[] test = {1, 3, 4, 5, 7, 8, 9, 10, 11, 12};
        System.out.println(new Test017().search(test,3));
    }

    /*public int binSearch(int[] nums, int target){
        if(nums.length == 1 && target == nums[0]){
            return 0;
        }
        int length = nums.length;
        int index = binFindNum(nums,0,length,target);
        return index;
    }

    public int binFindNum(int[] nums, int left, int right, int target){
        int middle = (left + right)/2;
        if(nums[left] == target){
            return left;
        }
        if(left >= right){
            return -1;
        }
        if(target == nums[middle] && target != nums[middle - 1]){
            return middle;
        }
        if(target > nums[middle]){
            return binFindNum(nums,middle+1, right, target);
        }
        if(target <= nums[middle]){
            return binFindNum(nums,left,middle,target);
        }
        return -1;
    }*/

    public int search(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int middle = left + (right - left)/2;
            if (nums[middle] == target) {
                return nums[middle];
            }
            if(nums[middle] < target){
                left = middle + 1;
            }
            if(nums[middle] > target){
                right = middle;
            }
        }
        return -1;
    }

}
