package day5;
//First unique character --Lc 387
/*Idea : Count each letter, then return the first index whose count is 1
Approach : Brute force - for each char, scan the rest
Count array -Pass 1 counts,pass 2 finds the index
HashMap -same with a map
*/
public class p45 {
    static int firstUniqChar(String s){
        int[] cnt = new int[26];
        for( char c : s.toCharArray())
            cnt[c - 'a']++;
        for(int i = 0 ; i < s.length() ;i++)
            if(cnt[s.charAt(i) - 'a']== 1)
                return i;
        return -1;
    }
    void main() {
        System.out.println(firstUniqChar("Leetcode"));
    }
}
