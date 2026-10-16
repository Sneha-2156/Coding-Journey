package day2;
//Selection sort

/*
--Find the smallest element in the unsorted array
--swap it with the first element of that section
--move to the next position
--repeat
 */
import java.util.*;
public class p28 {
    void main(){
        int [] arr = {64,25,12,22,11};
        for( int i = 0 ; i < arr.length ; i++){
            int minIndex = i;
            for( int j = i+1 ; j < arr.length ;j++){
                if( arr[j] < arr[minIndex]){
                    minIndex = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

// time = 0(n^2) ; Space = 0(1)
