package day2;
// Count the frequency of each element

/*--The key reoresents the number
--THe value represents its frequency
--getOrDefault(num,0) returns the current count or 0 if the number isn't present
--add 1 to the count
 */
import java.util.HashMap;
import java.util.Map;
public class p21 {
    void main(){
        int [] arr = { 1,2,2,3,1,2};
        HashMap<Integer,Integer> freq = new HashMap<>();  // freq --> frequency
        for( int num : arr ){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for( Map.Entry <Integer,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+" appears "+entry.getValue()+" times");
        }
    }
}

// Time = 0(n) ; Space = 0(n)
