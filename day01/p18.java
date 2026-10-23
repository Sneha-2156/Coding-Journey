package day01;
//Reverse a string
/* String represents a sequence of characters */
public class p18 {
    void main(){
        String str = "Java";
        String reversed = "";
        //start at last character ; move backward through the string ; add each character to result
        for( int i = str.length() -1 ; i >= 0 ; i--){
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}

//String builder are more efficient for larger strings
