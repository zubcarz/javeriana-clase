#include <iostream>

using namespace std;
const int ROWSIZE = 3;
const int COLUMN = 2;

int main()
{
    // define matrix
    int edades[ROWSIZE][COLUMN] = {{1,2},{9,8},{14,21}};
    int countFilas = 0;

    int filas = (sizeof(edades)/sizeof(edades[0]));
    
    cout << sizeof(edades) << endl;
    cout << sizeof(edades[0]) << endl;

    int columnas = (sizeof(edades[0])/sizeof(edades[0][0]));

    cout << sizeof(edades[0]) << endl;
    cout <<sizeof(edades[0][0]) << endl;

    // for (int i = 0; i < filas; i++)
    // {
    //     for (int j = 0; j < columnas; j++)
    //     {
    //         cout<<edades[i][j]<<endl;
    //     }
    //     countFilas = countFilas + 1;
    // }

    // cout << countFilas << endl;
}