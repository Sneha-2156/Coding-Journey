package day02;
// Find dupplicate elements

/*--seen.add(num) returns false if the number already exists
--if it returns fasle, the number is a duplicate
--A second set prevents the same duplicate from being recorded repeatedly
 */
import java.util.HashSet;
import java.util.Set;
public class p22 {
    void main() {
        int [] arr = { 1,2,3,2,4,1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for ( int num : arr){
            if( !seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }
}

// Time = 0(n) ; Space = 0(n)