package day7;
//Longest consecutie sequence -LC 128
/*Idea : USe hashSet
*/
import java.util.*;
public class p55 {
    public static int LongestCons(int[] nums){
        //store all numbers for the fastest lookup
        Set<Integer>set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        //check every number
        for(int num : set){
            //Start only if this is the beginning of a sequence 
            if( !set.contains(num - 1)){
                int currentNum = num;
                int length = 1;
                //count consecutive numbers
                while(set.contains(currentNum+1)){
                    currentNum++;
                    length++;
                }
                //update the longest sequence
                longest = Math.max(longest,length);
            }
        }
        return longest;
    }
    void main() {
        int[] nums ={100,4,200,1,3,2};
        System.out.println(LongestCons(nums));
    }
    
}

//Time = 0(n) ; Space = 0(n)