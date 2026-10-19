package day5;
//Longest common pred]fix --LC 14
/*Idea : Take the first word as the prefix and shrink it until every word starts with it.
Approach : Horizontal scan -shrink the prefix word by word
Vertical scan -compare column by column
Sorting -Sort, then compare only the first and last
 */
public class p44 {
    static String longestCommonPrefix(String[] strs){
        String prefix = strs[0];
        for(int k=1;k<strs.length;k++){
            while(!strs[k].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length() -1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    void main() {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
