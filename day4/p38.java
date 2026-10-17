package day4;
//LC 217 - contains duplicates
import java.util.*;
public class p38 {
    public  static boolean containDuplicates(int[] nums){
        Set<Integer>seen = new HashSet<>();
        for(int n : nums){
            if(seen.contains(n)){
                return true;
            }
            seen.add(n);
        }
        return false;
    }
    void main() {
        int[] nums ={ 1,2,3,1};
        System.out.println(containDuplicates(nums));
    }
}
