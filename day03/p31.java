package day03;
//fibonacci numbers
//Better approach -- For efficient claculation without repeated work. Time = 0(n) ; Space = 0(1)
public class p31 {
    static int fib(int n){
        int a = 0 , b = 1;
        for( int i = 0 ; i < n ; i++){
            int next = a+b;
            a = b;
            b = next;
        }
        return a;
    }
    void main() {
        int n = 10;
        System.out.println(fib(n));
    }
}
