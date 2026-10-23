package day01;
// Find the smallest element
public class p13 {
    void main() {
        int [] arr = { 12,5,8,2,19};
        int min = arr[0];
        for ( int i = 0 ; i < arr.length ; i++){
            if( arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

// Time = 0(n) ; Space = 0(1)

/* an Array stores multiple values of the same type in a single variable */