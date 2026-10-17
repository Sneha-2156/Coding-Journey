package day3;
//Repeat & missing number
/* Problem : u are given an array containing numbers from 1 to n
--one number appears twice
--one number is missing
--Find both numbers
*/
/*Apprach : Brute force -- frequency counting
 */
public class p33 {
    void main() {
        int[] arr = {3,1,2,5,3};
        int n = arr.length;
        //store repeat & missing numbers
        int repeating = -1;
        int missing = -1;
        for( int num = 1 ; num <= n ; num++){
            int cnt = 0;
            for(int value : arr){
                if(value == num)  cnt++;
            }
            if(cnt == 2)  repeating = num;
            if(cnt == 0)  missing = num;
        }
        System.out.println("Repeating: "+repeating);
        System.out.println("Missing: "+missing);
    }
}

// Time = 0(n^2) ; Space =0(1)