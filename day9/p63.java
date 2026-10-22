package day9;
//contains duplicate -LC 217

public class p63 {
    public static boolean containsDuplicate(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    void main() {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}

//Time = 0(n^2) ; Space = 0(1)
