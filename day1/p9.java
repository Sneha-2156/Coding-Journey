package day1;
// Print the first n Fibonacci series numbers

/* Logic : keep track of the previous two numbers and calculate the next number 
->Each number after the first two is the sum of the preious two
   */
public class p9 {
    void main(){
        int n =7 , a = 0 , b = 1;
        System.out.println("Fibonacci sequence:");
        for( int i = 0 ; i < n ; i++){
            System.out.print(a+" ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}

// time = 0(n) ; Space = 0(1)
