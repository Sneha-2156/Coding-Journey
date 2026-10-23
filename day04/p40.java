package day04;
//Merge intervals --LC 56
/* Logic : Think of meeting - sort them by start time.
Take the first meeting
For each meeting, if it starts before th ecurrent one ends,
they overlap, so stretch the current meeting's end.
If not, the current one is finished, so save it and start new one.
 */
/* Approach :
Brute force -- Compare every pair and keep merging until nothing can overlap,
-               slow and messy, 0(n^1) or worse
Sort first(best) --After sorting by start, only neightbours can overlap,
-                  so pass is enough.Time 0(n log n), Space 0(n)
*/
import java.util.*;
public class p40 {
    @SuppressWarnings("CollectionsToArray")
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List <int[]>result = new ArrayList<>();
        int[] current = intervals[0];
        result.add(current);
        for(int i = 1 ; i< intervals.length ; i++){
            int[] next = intervals[i];
            if(next[0]<= current[1]){
                current[1] = Math.max(current[1],next[1]);
            }else{
                current = next;
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    void main(){
        int[][] intervals ={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
