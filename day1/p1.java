package day1;

import java.util.Scanner;

//  check Even or odd integer
public class p1 {
    void main() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int n = in.nextInt();
            if(n % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
