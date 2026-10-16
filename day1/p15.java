package day1;
// Find the Second-largest distinct element
public class p15 {
    void main(){
        int [] arr = { 10,5,20,8,20};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for( int num : arr){
            if( num > largest){
                secondLargest = largest ;
                largest = num;
            }else if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        if( secondLargest == Integer.MIN_VALUE){
            System.out.println("NO second-large distinct element");
        }else{
            System.out.println(secondLargest);
        }
    }
}


// Time = 0(n) ; Space = 0(1)

/*Logic :
----Track the largest & second largest distinct values
----when a new maximum appears, move the old maximum into seconLargest
----Otherwise, update secondLargest when appropriate
*/