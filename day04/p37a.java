package day04;
//LC 53 --Maximum subarray
/*Approach : Kadane's A;gorithm
HOw = keep current = best sum ending here.
-At each number, either extend the previos subarray or start fresh :
-current = max(num,current+num) .Track the overall max
Why = if running sum goes negative, it only hurts the next numbers, so drop it
 */
//When == best contiguous subarray sum. Time = 0(n) ; Space = 0(1)
public class p37a {
    public static int maxSubArray(int[] nums){
        int current = nums[0];
        int max = nums[0];
        for(int i = 1 ; i< nums.length ; i++){
            current = Math.max(nums[i],current+nums[i]);
            max = Math.max(max,current);
        }
        return max;
    }
    void main() {
        int[] nums = {-2,1,-3,4,-1,2};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
