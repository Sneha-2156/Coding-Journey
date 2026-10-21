package day7;
//3Sum --LC 15
/*Problem : Given an integer array nums, find all unique triplets whose sum equals 0
 */
/*Logic : -Sort the array
-Fix one element using index i
-use two pointers,left and right,to find two other elements
-if the sum is zero, save the triplet
-Skip duplicate elements to avoid duplicate triplets
*/
import java.util.*;
public class p52 {
    public static List<List<Integer>>threeSum(int[] nums){
        List<List<Integer>>result = new ArrayList<>();
        //Sort the array
        Arrays.sort(nums);
        //FIx the first element
        for(int i =0;i<nums.length;i++){
            //Skip duplicate first elements
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            //Find the other two elements
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;right--;
                    //skip duplicate left elements
                    while(left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    //Skip duplicate right elements
                    while(left<right&&nums[right]==nums[left]){
                        right--;
                    }
                }else if(sum<0){
                    //Increasee the sum
                    left++;
                }else{
                    //Decrease the sum
                    right--;
                }
            }
        }
        return result;
    }
    void main() {
        int nums[] ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

// Time = 0(n^2) ; Space = 0(log n)
