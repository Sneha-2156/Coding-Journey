package day06;
//Majority elements -LC 169

public class p50 {
    public static int majority(int[] nums){
        int candid = 0,cnt=0;
        for(int num : nums){
            if(cnt ==0){
                candid = num;
            }
            if(num == candid) cnt++;
            else cnt--;
        }
        return candid;
    }
    void main() {
        int[] nums ={2,2,1,1,1,2,2};
        System.out.println(majority(nums));
    }
}
