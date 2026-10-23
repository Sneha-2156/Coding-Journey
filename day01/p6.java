package day01;
// Reverse a number
public class p6 {
    void main(){
        int n = 1234 ;
        int reversed = 0;
        while ( n > 0){
            int digit = n % 10; // extracts last digit
            reversed = reversed * 10 + digit ; // adds that digit to reversed number
            n /= 10; // removes last digit
        }
        System.out.println("Reverse of the given number : " + reversed);
    }
    
}
// d -> number of digits
// Time = 0(d) ; Space = 0(1)