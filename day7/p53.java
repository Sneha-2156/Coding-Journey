package day7;
//Container with most water -LC 11
/*Problem : Given an array height,
each element represents the height of the vertical line.
Find two lines that, together with the line x-axis,
can hold the maximum amount of water.
 */
// Area = min(height[left],height[right])x(right-left)

public class p53 {
    public static int maxArea(int[] height){
        int left=0,right=height.length-1,maxWater=0;
        while(left<right){
            //Find the limiting height
            int minHeight =Math.min(height[left],height[right]);
            //Calculate the area
            int width = right-left;
            int area = minHeight*width;
            //update maximum area
            maxWater=Math.max(maxWater,area);
            //Move the shorter line
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    void main(){
        int[]height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}

//Time = 0(n) ; Space = 0(1)
