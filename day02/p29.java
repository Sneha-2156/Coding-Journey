package day02;
// factorial using recursion
public class p29 {
    void main() {
        int num =5;
        System.out.println(fact(num));
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n*fact(n-1);
    }
    
}
