package day9;
//Running Sum of 1D array -LC 1480
import java.util.*;
public class p61 {
    public static int[] runningSum(int[] nums){
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            nums[i] =sum;
        }
        return nums;
    }
    void main(){
        int nums[] ={1,2,3,4,5};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
}
