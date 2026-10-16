package day2;
/*Find the missing number -- An array contains distinct numbers from 0 through n,
with one number missing. Find it.
*/

/* Sum of numbers from 0 to n : Sum = n(n+1)/2;
Subtract the actualSum from expectedSum
 */
public class p25 {
    void main(){
        int [] arr = { 3,0,1};
        int n = arr.length;
        int expectedSum = n *(n+1)/2;
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        System.out.println("Missind number : "+(expectedSum - actualSum));
    }
}

// Time = 0(n) ; Space = 0(1)


/*
arr = {3,0,1}  --> n =3
expectedSum = n * (n+1)/2
expectedSum = 3 * (3+1)/2 = 6
0+1+2+3 = 6

0+3 = 3
3+0 = 3
3+1 = 4

6 - 4 = 2
 */
