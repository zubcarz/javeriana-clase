
#include "iostream"
#include <stdio.h>
#include <vector>
#include <string>
#include <time.h>

using namespace std;

int main()
{

    int list[] = {1, 2, 3, 4, 5, 6, 7};
    int sizeVector = 0;
    int sizeElement = 0;
    int *ptrList = &list[0];

    sizeElement = sizeof(list[0]);
    sizeVector = (sizeof(list)/sizeElement);

    cout << "size element " << sizeElement << endl;
    cout << "size vector " << sizeVector << endl;
    cout << "dir array " << ptrList << endl << endl;

    for (int i = 0; i < sizeVector; i++)
    {
        cout << "Iteracion ->" << i << endl;
        cout << "Memoria   ->" << ptrList + i << endl;
        cout << "Valor     ->" << *(ptrList + i) << endl << endl;
    }

    return 0;
}