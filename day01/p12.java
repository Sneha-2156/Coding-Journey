package day01;
//Find the GCD of two numbers

/* GCD - Greatest common divisor --> The largest positive integer the divides both numbers exactly*/

//Uses the Euclidean algorithm
public class p12 {
    void main() {
        int a = 12, b =18;
        while ( b != 0 ){
            int rem = a % b;  // rem -> remainder
            a = b;
            b = rem ;
        }
        System.out.println(a);
    }
}

// Time = 0(log(min(a,b))) ; Space = 0(1)
