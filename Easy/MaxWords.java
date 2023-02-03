/**
 * File:        MaxWords.java
 * Project:     LeetCode
 * Date:        2/3/23
 * Author:      AzureMouse
 * Description:
 * Finds the max number of words in a given array of strings
 */

class MaxWords{
    public int mostWordsFound(String[] sentences) {
        final int LENGTH = sentences.length;
        int max = 0;

        // Iterate over the length of the array
        for(String temp : sentences){
            max = Math.max(max, temp.split(" ").length);
        }

        return max;
    }
}