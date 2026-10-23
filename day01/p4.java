package day01;
// Sum of first n natural numbers 1 to n

/* Add each numbers during eery loop iteration */
public class p4 {
    void main(){
        int n = 5;
        int sum = 0;
        for( int i = 0 ; i <= n ; i++){
            sum += i ;
        }
        System.out.println(" Sum is :" + sum);


    }
}

// Time = 0(n) ; Space = 0(1)