package day5;
/*Idea : Ignore non-alphanumeric characters and cases. Compare from both ends.
approach : Brute force -- Clean the string, reverse it, compare
Two pointer : i from left,j from right, skip junk,compare
 */
//Two pointers
public class p42 {
    static boolean isPalindrome(String s){
        int i =1, j = s.length() - 1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            i++;j++;
        }
        return true;
    }
    void main() {
        System.out.println(isPalindrome("A man, a plan, a canal :Panama"));
        System.out.println("Madam");
    }
    
}
