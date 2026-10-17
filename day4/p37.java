package day4;
//LC 53 --Maximum subarray
//Find the contiguous subarray with largest sum
/* approach : Brute force
How = try every start and end, add up the sum
when = n is tiny. Time 0(n^2) with a running sum (0(n^3) if re-add each time)
 */
public class p37 {
    public static int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i< nums.length ; i++){
            int sum = 0;
            for(int j = i ; j < nums.length ; j++){
                sum += nums[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }
    void main() {
        int[] nums = {-2,1,-3,4,-1,2};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
