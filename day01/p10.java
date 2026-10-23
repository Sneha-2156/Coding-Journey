package day01;
// Find the largest element in an array

public class p10 {
    void main(){
        int [] arr = { 12,45,7,89,23};
        int max = arr[0];  // Assume the first element is largest
        for ( int i =0 ; i < arr.length ; i++){
            if ( arr[i] > max){ // compare every element with max
                max = arr[i];  // update max whenever u find larger element
            }
        }
        System.out.println(max);
    }
}

// Time = 0(n) ; space = 0(1)
