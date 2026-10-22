package day9;
//Single number -LC 136
public class p64 {
    public static int singleNum(int[] nums){
        int result =0;
        for(int num : nums){
            result = result^num;
        }
        return result;
    }
    void main() {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNum(nums));
    }
}
//Time = 0(n) ; Space = 0(1)
