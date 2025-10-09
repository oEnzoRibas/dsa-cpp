package Recursion;

public class DecimalToBinary {
    private static long decToBinary(int dec){
        if (dec == 0){
            return 0;
        }
        else return (dec % 2) + 10 * decToBinary(dec /2);
    }
}

