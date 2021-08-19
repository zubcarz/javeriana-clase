#include <iostream>
using namespace std;

void cubeReferencia(int *ptrFactorial);
int cubeValor (int n);

int main()
{

    // First example
    // cout << "First example" << endl;
    // int x = 12312;
    // printf("La direccion en memoria es: %d, el valor es %d. \n", &x, x);

    // cout <<" La direccion es: " << &x << " el valor es: " << x << endl;

    double *y; // pointer to a double
    char *z;   // pointer to a char
    int *w;    // pointer to a int
    float *v;  // pointer to a float

    // w = x;
    // w = &x;

    // z = &x;

    // printf("La direccion en memoria es: %x, el valor es %i. \n", w, *w);

    // Second example
    // cout << endl << "Second example" << endl;
    // int var = 50;
    // int *p;

    // p = &var;

    // cout << var << endl;
    // // Output 50 (el valor de var)

    // cout << p << endl;
    // // // Output 0x61fe00(El valor de la dirreccion en memoria)

    // cout << *p << endl;
    // // Output 50 (el valor almacenado en la posicion en memoria)

    // // Third example
    // cout << endl<< "Third example" << endl;
    // int x1 = 5;
    // int *p1 = &x1;
    // int r = 0;

    // r = x1 + 4;
    // cout << r << endl;
    // r = *p1 + 4;
    // cout << r << endl;
    // r = p1 + 4;
    // cout << r << endl;

    // // Fourth example
    // cout << endl
    //      << "Fourth example" << endl;

    // int aa;    /* a es un entero */
    // int *ptrA; /* ptrA es un apuntador a un entero */

    // aa = 7;
    // ptrA = &aa; /* ptrA toma la dirección de a */

    // printf("La direccion de aa es % p"
    //        "\nEl valor de ptrA es % p",
    //        &aa, ptrA);

    // printf("\n\nEl valor de aa es % d"
    //        "\nEl valor de * ptrA es % d",
    //        aa, *ptrA);

    // printf("\n\nMuestra de que *y &son complementos "
    //        "uno del otro\n &*ptrA = % p"
    //        "\n *&ptrA = % p\n",
    //        &*ptrA, *&ptrA);

    // // Fifth example
    cout << endl
         << "Fifth example" << endl;
    bool a1;
    char a2;
    short a3;
    int a4;
    long a5;
    long long a6;
    float a7;
    double a8;
    long double a9;

    cout << "bool -> " << sizeof(a1) << endl;
    cout << "char -> " << sizeof(a2) << endl;
    cout << "short -> " << sizeof(a3) << endl;
    cout << "int -> " << sizeof(a4) << endl;
    cout << "long -> " << sizeof(a5) << endl;
    cout << "long long -> " << sizeof(a6) << endl;
    cout << "float -> " << sizeof(a7) << endl;
    cout << "double -> " << sizeof(a8) << endl;
    cout << "long double -> " << sizeof(a9) << endl;

    // // Sixth example
    // cout << endl
    //      << "Sixth example" << endl;

    // int val = 3;
    // int result = 0;

    // // result = cubeValor(val);
    // cubeReferencia(&val);

    // cout << "cube -> " << val << endl;
    // // cout << "cube por valor -> " << result << endl;

    return 0;
}

void cubeReferencia(int *ptrFactorial)
{
    *ptrFactorial = *ptrFactorial * *ptrFactorial * *ptrFactorial;
}


int cubeValor (int n)
{
    int result =  n*n*n;
    return n;
}