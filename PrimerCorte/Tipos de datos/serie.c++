/*
comienza en 0 y 1, 
cada número subsiguiente es la suma de los dos números anteriores de la serie.
*/

using namespace std;
#include <stdio.h>
#include <iostream>

long fibonacci(long n);

int main()
{
    long resultado;
    int numero;
    printf("Introduzca un entero \n");
    // scanf("% ld", &numero);
    cin >> numero;
    resultado = fibonacci(numero);

    printf("Fibonacci(% ld) = % ld\n", numero, resultado);
    return 0;
}

long fibonacci(long n)
{
    if (n == 0 || n == 1)
    {
        return n;
    }
    else
    {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}