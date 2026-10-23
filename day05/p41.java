package day05;
//Trapping rain water --LC 42
/*Logic --> The array is bar heights.
After it rains, how much water is trapped between the bars?
 */
/*Key idea : water aboe one bar = (the shorter of the tallest bar on its left and the tallest bar on its right) - ( the bar's own height)
*water rises only up to th shorter wall.
*/
/*Aproach :
1. Brute force --For every bar, scan left and right to find the tallest walls.
-                Time 0(n^1),Space 0(1).Good for understanding the idea.
2.Prefix/Sufix arrays --Store the left max and right max for every bar first.
-                Time 0(n), Space 0(n) . Good when 0(n) space is fine.
3.Two pointers (Best) --Walk from both ends and track the maxes on the fly.
-                Time 0(n), Space 0(1) . Use it when asked fro optimal solution.
*/
public class p41 {
    public static int trap(int[] height){
        int left = 0,right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while(left < right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax = height[left];
                }else{
                    water += leftMax - height[left];
                }
                left++;
            }else{
                if(height[right]>=rightMax){
                    rightMax = height[right];
                }else{
                    water += rightMax - height[right];
                }
            }
        }
        return water;
    }
    void main() {
        int[] height = {3,0,2,0,4};
        System.out.println(trap(height));
    }
}
