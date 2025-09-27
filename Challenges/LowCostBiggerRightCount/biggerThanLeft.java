package Challenges.LowCostBiggerRightCount;

public class biggerThanLeft {
    public static void main(String[] args) {
        int[] a = {1, 14, 5, 2, 5};

        func(a);
    }

    static void func(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int contAtual = 0;

            for (int j = i; j < a.length; j++) {

                if (a[j] > a[i]) {
                    contAtual++;
                }
            }
            b[i] = contAtual;
        }

        for (int i : b) {
            System.out.println(i);
        }
    }

}
