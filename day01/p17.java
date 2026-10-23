package day01;
//Linear search 
// Find the index of the target
public class p17 {
    void main(){
        int [] arr = {10,20,30,40};
        int target = 30;
        int index = -1;
        //check each element from left to right
        for( int i = 0 ; i < arr.length ; i++){
            if( arr[i] == target){ // if element matches the target, save its index and stop
                index = i ;
                break;
            }
        }
        // if the target isn't found , return -1
        System.out.println(index);
    }
}

// Time = 0(n) ; Space = 0(1)
