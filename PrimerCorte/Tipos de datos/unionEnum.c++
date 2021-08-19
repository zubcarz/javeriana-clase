/*
comienza en 0 y 1, 
cada número subsiguiente es la suma de los dos números anteriores de la serie.
*/
using namespace std;
#include <stdio.h>
#include <iostream>
#include <string>

int main()
{
    // union char_int
    // {
    //     int num;
    //     char character;
    // } x;

    // x = {'a'};

    // cout << "x num: " << x.num << endl;
    // cout << "x char: " << x.character << endl;

    enum color
    {
        red,
        yellow = 20,
        green,
        blue
    };

    color col = red;
    color col2 = yellow;
    color col3 = green;
    color col4 = blue;
    cout << col << endl;
    cout << col2 << endl;
    cout << col3 << endl;
    cout << col4 << endl;

    // int n = blue;
    // cout << col;
}
