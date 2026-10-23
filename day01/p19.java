package day01;
// Check whether a string is palindrome 

/* Logic : Compare characters at opposite ends, moving toward the center */
public class p19 {
    void main(){
        String str = "MadaM";
        int left = 0;
        int right = str.length() -1;
        boolean isPalindrome = true;
        while ( left < right ){
            if( str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left ++;
            right --;
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}

// Time = 0(n) ; Space = 0(1)