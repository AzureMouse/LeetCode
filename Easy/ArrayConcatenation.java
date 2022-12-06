/**
* File:			ArrayConcatenation.java
* Project:		LeetCode
* Date:			12/05/22
* Author:		AzureMouse
* Description:
*
* Returns a new array with 2 times of the same array
*
**/

public class ArrayConcatenation{
	public int[] getConcatenation(int[] nums){
		final int LENGTH = nums.LENGTH;
		int[] numsClone = new int[LENGTH * 2];
		System.arraycopy(nums, 0, numsClone, 0, LENGTH); // -> Copy array
		System.arraycopy(nums, 0, numsClone, LENGTH, LENGTH); // -> Copy array starting at 0 to new array at the position of length with LENGTH numbers copied

		return numsClone;
	}
}
