package day1;

import java.util.Arrays;

// Reverse an array
public class p16 {
    void main(){
        int [] arr = { 1,2,3,4,5};
        // start with pointers at both sides
        int left = 0;
        int right = arr.length -1;
        while ( left < right){
            // swap two elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++; // move left pointer  toward right
            right --; // move right pointer toward left
            //stop when th epointers meet
        }
        System.out.println(Arrays.toString(arr));
    }

}

//Time = 0(n) ; Space = 0(1)