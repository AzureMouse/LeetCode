/**
 * File:			NDouble.java
 * Project:			LeetCode
 * Date: 			11/30/22
 * Author:			AzureMouse
 * Description:
 * 
 * Outputs true or false, depending on if the conditions are 
**/


/**
 * === NDouble problem ===
 * Given an array of integers, check if there exist two indices i and j such that
 * i != j
 * i greater than but equal to 0, j less than length of arr 
 * arr[i]  2* arr[j] i is larger than j and j is saller than i
 *
 * === Algorithm ===
 * Initalize a boolean variable called isValid
 * Iterate over each element using a nested for loop
 * Compare the conditions from a given array, if the conditions are met, return true, otherwise return false
**/


public NDouble{
	public boolean checkIfExist(int[] arr){

		final int LENGTH = arr.length;
		boolean isValid = false;

		for(int i = 0; i < LENGTH; i++){
			for(int j = 0; j < LENGTH; j++){
				if(i != j && i >= 0 && j < LENGTH && arr[i] == 2 * arr[j]){
					return true;
				}
			}

			return false;
		}
		
		
	}
}
