using namespace std;
#include "iostream"
#include <stdio.h>

const int SIZE_ARRAY = 8;

int main()
{

    int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
    char charArray[] = {'a', 'b', '3', '4', '5', '6', '7', '8'};

    int *ptrNum;
    char *ptreChar;

    ptrNum = &numArray[0];
    ptreChar = &charArray[0];

    // cout << "value numArray in position 0 -> " << &*ptrNum << endl;
    printf("La direccion en memoria es: %x", &*ptreChar);

    ptrNum++;
    ptreChar++;

    // cout << "value numArray in position 0 -> " << &*ptrNum << endl;
    printf("La direccion en memoria es: %x", &*ptreChar);

    // ptrelementArray = &numArray[0];
    // ptrelementArray1 = &numArray[1];
    // ptrelementArray2 = &numArray[2];

    // printf("size int array -> %d \n", sizeof(numArray));
    // printf("size element int array -> %d \n", sizeof(numArray[0]));
    // cout << "dir numArray " << &numArray << endl;
    // cout << "dir numArray " << &numArray[0] << endl;
    // cout << "dir numArray " << &numArray[1] << endl;

    // printf("\n");
    // printf("size char array -> %d \n", sizeof(charArray));
    // printf("size element char array -> %d \n", sizeof(charArray[0]));
    // cout << "charArray numArray " << &numArray << endl;
    // cout << "charArray numArray " << &numArray[0] << endl;
    // cout << "charArray numArray " << &numArray[1] << endl;

    // printf("\n");
    // cout << "dir numArray " << ptrelementArray << endl;
    // // cout << "dir numArray " << ptrelementArray1 << endl;
    // // // cout << "dir numArray " << ptrelementArray2 << endl;
    // printf("-> \n");
    // cout << "dir numArray " << ptrelementArray + 1 << endl;
    // cout << "dir numArray " << ptrelementArray + 2 << endl;

    // for (int i = 0; i < 8; i++)
    // {
    //     cout << numArray[i] << endl;
    // }
    // for (int i = 0; i < 8; i++)
    // {
    //     printf("Char: %c \n", numChar[i]);
    // }

    return 0;
}