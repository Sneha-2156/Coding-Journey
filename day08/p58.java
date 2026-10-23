package day08;
//Reverse string --LC 344
import java.util.*;
public class p58 {
    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        while(left<right){
            //store th eleft character
            char temp = s[left];
            //move the right character to the left
            s[left] = s[right];
            //Move the saes character to the right
            s[right] = temp;
            //move both pointers
            left++;
            right--;
        }
    }
    void main() {
        char[] s = { 'h','e','l','l','o'};
        System.out.println("Original: "+ Arrays.toString(s));
        reverseString(s);
        System.out.println("Reversed string: "+Arrays.toString(s));
    }
    
}
