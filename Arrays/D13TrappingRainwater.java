package Arrays;
import java.util.*;

/* Q: Trapped Rainwater
 * Given n non-negative integers representing an elevation(height) map where the width of each bar is 1
 * compute how much water it can trap after raining height = [4,2,0,6,3,2,5].
*/

public class D13TrappingRainwater {
    public static int rainwaterTrapped(int height[], int n){

        //Creating two Auxilary Array lefMax and rightMax.

        //Calculating left max boundary
        int leftMax[]=new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
            }

        //Calculating right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1] = height[n-1];

        for(int j=n-2; j>=0;j--){
            rightMax[j]=Math.max(rightMax[j+1], height[j]);
            }
        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++){

            //waterLevel = min(leftMax bound, rightMax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water = waterLevel - height[i](if width of bar is 1 otherwise multiply it with width)
            trappedwater += (waterLevel - height[i]);

        }
        return trappedwater;


        }




    public static void main(String[] args) {
        int []height = {4, 2, 0, 6, 3, 2, 5};
        int n = height.length;
        System.out.println(rainwaterTrapped(height, n));
    }

}
