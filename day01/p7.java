package day01;
// Count the digits

/* Logic : Each division by 10 removes one digit */
public class p7 {
    void main(){
        int n = 58321;
        int cnt = 0;
        if( n == 0){
            cnt = 1;
        }else{
            while( n != 0){
                cnt ++;
                n /= 10;
            }
        }
        System.out.println("Digit count of the given number: " + cnt);
    }
}

// Time = 0(n) ; Space = 0(1)
