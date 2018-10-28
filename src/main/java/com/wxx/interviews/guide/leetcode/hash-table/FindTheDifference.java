package com.wxx.interviews.guide.leetcode.hash// Given two strings s and t which consist of only lowercase letters.

// String t is generated by random shuffling string s and then add one more letter at a random position.

// Find the letter that was added in t.

// Example:

// Input:
// s = "abcd"
// t = "abcde"

// Output:
// e

// Explanation:
// 'e' is the letter that was added.

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int charCodeS = 0;
        int charCodeT = 0;
        
        for(int i = 0; i < s.length(); i++) {
            charCodeS += (int)(s.charAt(i));
        }
        
        for(int i = 0; i < t.length(); i++) {
            charCodeT += (int)(t.charAt(i));
        }
        
        return (char)(charCodeT - charCodeS);
    }
}
