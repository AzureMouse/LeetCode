/**
 * File:		PermutationArray.java
 * Project:		LeetCode
 * Date:		12/04/22
 * Author:		AzureMouse
 * Description:
 *
 * Builds a array from a permutation array
**/

public class PermuationArray{
	public int[] buildArray(int[] nums){
		final int LENGTH = nums.length;
		int[] ans  = new int[LENGTH];

		// Populate array with values from permutation array
		for(int index = 0; index < LENGTH; index++){
			ans[index] = nums[nums[index]];
		}

		return ans;
	}
}
