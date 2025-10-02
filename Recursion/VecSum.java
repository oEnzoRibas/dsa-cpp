package Recursion;

public class VecSum {
    static int vecSumEven(int[] vec, int i){
        if (i < 0 ){
            return 0;
        }
        if (vec.length % 2 == 0){
            return vec[i] + vecSumEven(vec,i-2);
        }
        else {
            return vecSumEven(vec ,i - 1);
        }
    }

    public static void main(String[] args) {
        int[] v = {0,1,2,3,4,5,6,7,8,9};
        int[] v2 = {1,0,1,0,4,0,6,0,8,0};

        System.out.println(        vecSumEven(v2, v2.length-1));
    }
}
