package day03;
// LC 509 - Fibonacci number
/* Brute force -- TO underStand recursion . Time = 0(n^2) ; Space = 0(n) */
public class p30 {
    static int fib(int n){
        if( n <= 1)  return n;
        return fib(n - 1) + fib( n - 2);
    }
    void main(){
        int n = 10;
        System.out.println(fib(n));
    }
}
