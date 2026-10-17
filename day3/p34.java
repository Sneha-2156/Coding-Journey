package day3;
// REaeat & missing numbers
/* Approach : Better approach -- Frequency Array
*/
/* Logic : --Create a frequency array
--Count each number's occurences
--find the number occuring twicw and number occuring zero times
 */
public class p34 {
    void main() {
        int[] arr ={3,1,2,5,3};
        int n = arr.length;
        int[] frequency = new int[n+1];
        for(int num : arr){
            frequency[num]++;
        }
        int repeating = -1;
        int missing = -1;
        for(int i=1;i<=n;i++){
            if(frequency[i]==2){
                repeating = i;
            }
            if(frequency[i] ==0){
                missing = i;
            }
        }
        System.out.println("Repeating: "+repeating);
        System.out.println("Missing: "+missing);
    }
}

// Time = 0(n) ; Space = 0(n)