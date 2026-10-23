package day01;
// check whether number is Prime
public class p8 {
    void main(){
        int n = 7;
        boolean isPrime = true;
        if ( n <= 1){
            isPrime = false;
        }else{
            for( int i = 0 ; i <= n/i ; i++){
                if ( n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }

    }
}

// Time = 0(square root n) ; Space = 0(1)