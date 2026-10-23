package day08;
//Reverse words in string III --LC 557
//Approach : String builder
public class p59 {
    public String reverseWords(String s){
        //Split the sentence into words
        String[] words = s.split("");
        //Store the final result
        StringBuilder result = new StringBuilder();
        //Process each words
        for(int i = 0;i<words.length;i++){
            //Reverse the current word
            StringBuilder word = new StringBuilder(words[i]);
            word.reverse();
            //append the reverse word
            result.append(word);
            //add space between words
            if(i< words.length-1){
                result.append("");
            }
        }
        //return the final string
        return result.toString();
    }
    void main() {
        String s = "Let's take Leetcode contest";
        System.out.println("Original: "+s);
        String answer = reverseWords(s);
        System.out.println("Reversed: "+answer);
    }
}
