package day6;
//Merge intervals --LC 56

import java.util.*;

public class p46{
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        for(int[] interval : intervals){
            if(result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]){
                result.add(interval);
            }else{
                result.get(result.size() - 1 )[1] = Math.max(result.get(result.size() - 1)[1],interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    void main(){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }

}