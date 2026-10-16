package day2;
// Two sum
/* Find the indoces of the two different elements whose sum equals the target */
import java.util.*;
// Brute force
public class p26 {
    void main(){
        int [] arr = {2,7,11,15};
        int target = 9;
        for( int i =0 ; i < arr.length ; i++){  // selects the first element
            for( int j = i+1 ; j < arr.length ; j++){ //checks every subsequent element.
                if( arr[i] + arr[j] == target){
                    System.out.println(Arrays.toString(new int[]{i,j}));
                    return ;
                }
            }
        }
        System.out.println("No solution");
    }
}

// Time = 0(n*2) ; Space = 0(1)
