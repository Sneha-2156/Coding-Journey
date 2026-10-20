package day5;
//valid anagram --LC 242
/* Idea : Same letters with the same counts
Approach : Sorting - sort both, then equals
Count array - int[26]:+1 for s, -1 for t, all must be zero
HashMap - same counting with a map
 */
//Count array
public class p43 {
    static boolean isAnagram(String s,String t){
        if(s.length() != t.length()) return false;
        int[] cnt = new int[26];
        for(int k=1 ; k<s.length();k++){
            cnt[s.charAt(k)-'a']++;
            cnt[t.charAt(k)-'a']--;
        }
        for(int c : cnt)
            if( c != 0)
                return false;
        return true;
    }
    void main() {
        System.out.println(isAnagram("Anagram","nagaram"));
    }
}
