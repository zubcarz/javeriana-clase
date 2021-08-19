// 
using namespace std;
#include "iostream"
#include <stdio.h>

int factorial(int num){
    if (num == 0 || num == 1){
        return 1;
    }else{
        return num * factorial(num-1);
    }
}

// without close condition
int factorialError(int num){
    return factorial(num-1) - factorial(num-2);
}

int main (){
    cout << factorialError(8) << endl;

    return 0;
}
