package day03;
//repeat & missing numebrs [Optimal approach]
/*S = actualSum - expectedsum  =x - y
P = ActualSquareSum - expectedSquareSum = x^2 - y^2
x+ y = P/S
x = (S+P/S)/2
y = x - S
 */
public class p35 {
    void main() {
        int[] arr ={3,1,2,5,3};
        int n = arr.length;
        long expectedSum = (long)n*(n+1)/2; // sum of numbers from 1 to n
        long expectedSquareSum = (long)n*(n+1)*(2L*n+1)/6; //sum of squares from 1 to n
        //actual sums
        long actualSum = 0;
        long actualSquareSum = 0;
        for(int num : arr){
            actualSum += num; // add the current number
            actualSquareSum += (long)num*num; //add the square of the current number
        }
        long difference = actualSum - expectedSum;
        long squareDifference = actualSquareSum - expectedSquareSum;
        long sum = squareDifference/difference;
        long repeating = (sum+difference)/2;
        long missing = repeating - difference;
        System.out.println("Repeating: "+repeating);
        System.out.println("Missing: "+missing);
    }
}

// Time = 0(n) ; Space = 0(1)
