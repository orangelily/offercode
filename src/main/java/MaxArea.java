/**
 * Created by orange on 16/9/11.
 */

import java.util.Stack;
public class MaxArea {


    /**
     * Largest Rectangle in Histogram
     *
     Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.

     http://www.leetcode.com/wp-content/uploads/2012/04/histogram.png
     Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].

     http://www.leetcode.com/wp-content/uploads/2012/04/histogram_area.png
     The largest rectangle is shown in the shaded area, which has area = 10 unit.

     For example,
     Given height = [2,1,5,6,2,3],
     return 10.
     *
     */
       public static void main(String[] args) {
            int[] height = {2,1,5,6,2,3};
            System.out.println(largestRectangleArea(height));
        }

        public static int largestRectangleArea(int[] height) {
            if(height.length == 0){
                return 0;
            }
            Stack<Integer> heightStack = new Stack<Integer>();
            Stack<Integer> indexStack = new Stack<Integer>();

            heightStack.push(height[0]);
            indexStack.push(0);

            int max = height[0];
            for(int i=1; i<height.length; i++){
            /*
             #1: current Larger than previous (top of height stack)
            Push current height & index as candidate rectangle start position
             */
                if(heightStack.isEmpty() || height[i] > heightStack.peek()){
                    heightStack.push(height[i]);
                    indexStack.push(i);
                }
            /*
             #3: current is less than previous
            Need keep popping out previous heights, and compute the candidate rectangle with height and width (current index MINUS previous index)
            Push the height and index (appropriate position) to stacks
             */
                else if(height[i] < heightStack.peek()){
                    int lastIndex = 0;  // used to keep track of last index which will be replacing the current index for current height inserting
                    while(!heightStack.isEmpty() && height[i]<heightStack.peek()){
                        lastIndex = indexStack.pop();
                        int h = heightStack.pop();
                        int w = i - lastIndex;
                        max = Math.max(max, h*w);
                    }
                    heightStack.push(height[i]);
                    indexStack.push(lastIndex); // Here should be lastIndex, one example: [2,1,2] => if lastIndex:3, if i:2
                }
            }

            // deal with remaining elements in the stack
            while(!heightStack.isEmpty()){
                int lastIndex = indexStack.pop();
                int h = heightStack.pop();
                int w = height.length - lastIndex;
                max = Math.max(max, h*w);
            }

            return max;
        }

        // TLE
       /* public static int largestRectangleArea2(int[] height) {
            int max = 0;
            int len = height.length;
            for(int i=0; i<len; i++){
                int minHeight = height[i];
                for(int j=i; j<len; j++){
                    minHeight = Math.min(minHeight, height[j]);
                    max = Math.max(max, (j-i+1)*minHeight);
                }
            }
            return max;
        }*/


}