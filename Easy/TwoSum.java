
/**
* File:                 TwoSum.java
* Project:              LeetCode
* Date:                 11/22/22
* Author:               AzureMouse
* Description:
*
* Given an array of integers, and some target, find the two index values that add up to said target
**/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int row = 0; row < nums.length; row++){
            for(int column = row + 1; column < nums.length; column++){
                
                // Verify if the current row and column is equal to the target 
                if(nums[row] + nums[column] == target){
                    return new int[] {row, column};
                }
            }
        }
        
        return new int[] {-1, -1}; // -> Return an array with invalid index values
    }
}