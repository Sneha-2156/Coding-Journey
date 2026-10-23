package day03;
// Find the first and last position of an element

/*--Use binary search to find the target
--when found, save its indices
--To find the first occurence, contine searching left
--To find the last occurence, continue searching right
 */
import java.util.*;
public class p32 {
    static int findPosition(int [] arr, int target, boolean findFirst){
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while( left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid]==target){
                result = mid;
                if(findFirst){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else if(arr[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
    void main() {
        int [] arr = {1,2,2,2,3,4};
        int target = 2;
        int first = findPosition(arr,target,true);
        int last = findPosition(arr,target,false);
        System.out.println(Arrays.toString(new int[] {first,last}));
    }
}
