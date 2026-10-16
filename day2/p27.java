package day2;
//Bubble sort
/* given array is [7,8,3,1,2]
bubble sort will run a  (n-1) loop and pick the largest element and place at the end
7,8,3,1,2
7,3,8,1,2
7,3,1,8,2
7,3,1,2,8 (first)
3,1,2,7,8(second)
1,2,3,7,8(third)
 */
public class p27 {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void main() {
        int arr[]={7,8,3,1,2};
        //bubble sort
        for(int i=0;i<arr.length-1;i++){ //n-1 loops
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swapping
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
//time complexity= 0(n^2)
