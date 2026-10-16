package day2;
//bubble sort
import java.util.*;
public class p27b {
    void main(){
        int [] arr = {5,3,8,1,2};  // creates an array
        for( int i = 0; i < arr.length - 1 ; i++){ //controls the sorting passes
            boolean swapped = false; // tracks whether any elements were swapped during the current pass
            for( int j =0 ; j < arr.length - 1 ; j++){  // copmpares adjacent elements
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if( !swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// Time = Average --> 0(n^2)  ,  Best case --> 0(n) ; Space = 0(1)
