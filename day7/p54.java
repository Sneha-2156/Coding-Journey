package day7;
//Subarray sum equals k -LC 560
/*Problem : Given an integer array nums and an integer  k,
return the total numbers of contiguous subarrays whose sum equals k.
 */
//USe prefix sum & HashMap
import java.util.*;
public class p54 {
    public static int subarraySum(int[] nums,int k){
        //Store prefix sums and their frequencies
        Map<Integer,Integer> map =new HashMap<>();
        //Prefix sum 0 occurs once before the array begins
        map.put(0,1);
        int currentSum=0;
        int cnt=0;
        for(int num :nums){
            //calculate the current prefix sum
            currentSum += num;
            //Find the prefix sum needed to make subarray sum k
            int required = currentSum - k;
            //Add the number of matching earlier prefix sums
            cnt += map.getOrDefault(required,0);
            //Record the current prefix sum
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return cnt;
    }
    void main() {
        int nums[] ={1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}

//Time = 0(n) ; Space = 0(n)
