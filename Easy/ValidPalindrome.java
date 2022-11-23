/**
 * File:		ValidPalindrome
 * Project:		LeetCode
 * Date:		11/23/22
 * Author:		AzureMouse
 * Description:
 *
 * Outputs true or false if the String given is a valid palindrome
 **/


class Solution {
    public boolean isPalindrome(String s) {
        String message = s.replaceAll("[^a-zA-Z0-9]", ""); // - > Remove all non-alphanumeric characters
		message = message.toLowerCase();

		final int LENGTH = message.length();
		int counter = 0;

		Stack<Character> stack = new Stack<Character>();

		// Populate the array with elements from the String
		for(int index  = 0; index < LENGTH; index++){
			stack.push(message.charAt(index));
		}

		// Verify if the String is a valid palindrome
		while(!stack.empty()){
			if(message.charAt(counter) != stack.peek()){
				return false;
			}

			counter++;
			stack.pop();
		}

		return true;
    }
}