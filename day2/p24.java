package day2;
//LC 26
import java.util.Arrays;

// Remove duplicates from a sorted array
public class p24 {
    void main(){
        int [] arr = {1,1,2,3,4,4};
        if(arr.length == 0){
            System.out.println("[]");
            return;
        }
        int index = 1;
        for(int i = 1 ; i < arr.length ; i++){
            if( arr[i] != arr[index - 1]){
                arr[index]= arr[i];
                index++ ;
            }
        }
        //Arrays.copyOf() --> creates a new array by copying a specified number of elements from an existing array.
        int [] result = Arrays.copyOf(arr,index);  // copy the elements
        //Arrays.toString() --> converts an array into a readable string representation
        System.out.println(Arrays.toString(result)); // display the elements readable
    }
}

// TIme = 0(n) ; Space = 0(1)
