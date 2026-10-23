package day02;
//Move all zeros to the end
//LC 283
/*--Start index at 0
--Copy every non-zero element to arr[index]
--Increase index after each copy
--Fill all remaining positions with zero
 */

//Two pointer approach
import java.util.*;
public class p23 {
    void main(){
        int [] arr = { 0,1,0,3,12};
        int index = 0;
        for(int num : arr){
            if(num != 0){
                arr[index] = num;
                index++ ;
            }
        }
        while(index < arr.length){
            arr[index] = 0;
            index++ ;
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Time = 0(n) ; Space = 0(1)