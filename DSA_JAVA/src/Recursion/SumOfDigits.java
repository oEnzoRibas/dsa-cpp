package Recursion;

/**
 *  Given an integer n, return the sum of its digits.
 *  Ex: 123 should return 6;
 */
public class SumOfDigits {
    private static int sumOfDigits(int n){
        if (n == 0){
            return 0;
        }
        return ( n % 10 ) + sumOfDigits(n / 10);
    }
}
