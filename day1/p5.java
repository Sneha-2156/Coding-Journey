package day1;
//Factorial of a non negative number

/* Logic : Multiply all integers  from 1 through n [ 0! = 1 ; 1! = 1]  */
public class p5 {
    void main() {
        int n = 5;
        long fact = 1;
        for ( int i = 1 ; i <= n ; i ++){
            fact *= i ;
        }
        System.out.println(fact);
    }
}

// Time = 0(n) ; Space = 0(1)
