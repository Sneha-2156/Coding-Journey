package day02;
// Two sum
import java.util.*;
public class p26b {
    void main(){
        int [] arr = {2,7,11,15};
        int target = 9;
        HashMap < Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length ; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println(Arrays.toString(new int[] {map.get(complement),i}));
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println("No solution");
    }
}

// Time = 0(n) ; Space = 0(n)
