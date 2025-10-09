#include <stdio.h>
#include "BiggerThanLeft.h"


int main() {
    int a[] = {1, 14, 5, 2, 5};

    func(a, sizeof(a)/sizeof(a[0]));
    return 0;
}

void func(int a[], int n) {
    int b[n];

    for (int i = 0; i < n; i++) {
        int contAtual = 0;

        for (int j = i; j < n; j++) {

            if (a[j] > a[i]) {
                contAtual++;
            }
        }
        b[i] = contAtual;
    }

    for (int i = 0 ; i < n; i++) {
        printf("%d ", b[i]);
    }
}
