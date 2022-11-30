/**
 * File:		PalindromeNumber.java
 * Project:		LeetCode
 * Date:		11/30/22
 * Author:		AzureMouse
 * Description:		
 *
**/

public class PalindromeNumber{
	/**
	 * === Palindrome problem ===
	 * Given an integer x, return true if x is a palindrome, false otherwise
	 *
	 * === Algorithm ===
	 * Create a new stack object of type integer
	 * Create a new String called s, convert x to String
	 * Iterate over the length of s
	 * Push s.charAt(index_ onto the stack
	 * verify if x and the top of the stack is equal to another
	 * 	if true, return true, otherwise return false
	**/


	/**
	 * Returns a boolean expression if a valid Palindrome exists or not
	 * @param - int x
	 * @return
	 * 	A boolean expression will be returned depending on if the outcome is true or false
	**/
	public boolean isPalinDrome(int x){
		Stack<Character> stack = new Stack<Character>();
		String s = String.valueOf(x); // -> Convert int to String
		final int LENGTH = s.length();
		int counter = 0;

		// Iterate over the length of s
		for(int index = 0; index < LENGTH; index++){
			stack.push(s.charAt(index);
		}

		// Verify if a palindrome exists
		while(!stack.empty()){
	
			if(stack.peek() != s.charAt(counter)){
				return false;
			}


			stack.pop(); // -> Remove the current element at the top of the stack
			counter++;
		}

		return true;
	}
}
