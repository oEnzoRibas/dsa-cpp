package Recursion;


/**
 *
 * Given an integer n, determine whether it is a palindrome number or not.
 * A number is called a palindrome if it reads the same from forward and backward.
 *
 */

public class CheckNumberPalindrome {
    private boolean isPalindrome(int i){
        i = Math.abs(i);
        return reverseNum(i,0) == i;
    }
    private static int reverseNum(int i, int reversed){
        if (i == 0) return reversed;
        return reverseNum(i / 10, reversed * 10 + i % 10);
    }


}
