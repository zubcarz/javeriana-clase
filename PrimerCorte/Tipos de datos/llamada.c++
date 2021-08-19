using namespace std;
#include "iostream"
#include <stdio.h>

int valueFunction(int y)
{
    y = 1;
    return y + 1;
}

int referenceValueFunction(int &y)
{
    y = y + 2;
    return y + 2;
}

int main()
{
    int x = 0;
    // paso por valor
    // printf( "% d ", valueFunction(x));
    // printf( "\n");
    // printf( "% d ", x);
    // printf( "\n");

    // paso por referencia
    printf( "% d ", referenceValueFunction(x));
    // 4
    printf( "\n");
    printf( "% d ", x);
    // 2
}

