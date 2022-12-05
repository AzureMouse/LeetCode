/**
* File:         SearchPosition.java
* Project:      LeetCode
* Date:         12/5/22
* Author:       AzureMouse
* Description:
*
* Returns the position of the target in the array, if not found, output the position where it should be
**/

class SearchPosition {
    public int searchInsert(int[] nums, int target) {
        // === Search Position Problem ===
        // Given a sorted array of numbers, return the index where the number would be
        //
        //
        // === Algorithm ===
        //
        // * Initalize and declare a low, high integer variable
        // * Use a while loop to iterate over the expression low <= high
        // * Initalize and declare a middle variable
        // * Verify if the middle is equal to the target or not
        // * Verify if target is to the right of the middle
        // * Verify if target is to the left of the middle
        // * Exit loop return low
        
        int low = 0;
        int high = nums.length - 1;
        int expectedPosition = 0;
        int counter = 0;
        
        while(low <= high){
            int middle = low + (high - low) / 2;
            
            if(nums[middle] < target){
                low = middle + 1;
                
            } else if(nums[middle] > target){
                high = middle - 1;

            }  else{
                return middle;
            }
        }
        
        return low;
    }
}