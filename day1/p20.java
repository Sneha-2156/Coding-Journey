package day1;
// Binary search --> The arrat must be sorted
public class p20 {
    void main(){
        int [] arr = {10,20,30,40,50};
        int target = 40;
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left < right){
            int mid = left + ( right - left ) / 2;
            if( arr[mid] == target){
                result = mid;
                break;
            }else if( arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        System.out.println(result);
    }
}

/*
--find the middle element
--if the target matches, stop.
--if the target is larger, search the right half
--if the target is smaller, search the left half
 */
// Time = 0(logn) ; Space = 0(1)
