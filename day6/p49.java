package day6;
//Sort colors -LC 75
import java.util.*;
public class p49 {
    public static void sortColors(int[] nums){
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            switch (nums[mid]) {
                case 0 ->                     {
                        int temp = nums[low];
                        nums[low]=nums[mid];
                        nums[mid]=temp;
                        low++;
                        mid++;
                    }
                case 1 -> mid++;
                default ->                     {
                        int temp = nums[mid];
                        nums[mid]=nums[high];
                        nums[high]=temp;
                        high--;
                    }
            }
        }
    }
    void main() {
        int[] nums ={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
