package day8;
//Single number -LC 136
//Idea : use the XOR oprator(^)
public class p60 {
    public static int singleNum(int[] nums){
        int result = 0;
        for(int num : nums){
            result = result^num;
        }
        return result;
    }
    void main() {
        int nums[] ={ 4,1,2,1,2};
        int ans = singleNum(nums);
        System.out.println("Single number: "+ans);
    }
    
}
