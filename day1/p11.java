package day1;
// Check palindrome number

/* Logic : A palindrome number reads same forward and backward */
public class p11 {
    void main() {
        int n = 121;
        int og = n ; // original -> og
        int rev = 0; // reversed -> rev
        while (n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if( og == rev ){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

}
// d -> number of digits
// Time = 0(d) ; Space = 0(1)
