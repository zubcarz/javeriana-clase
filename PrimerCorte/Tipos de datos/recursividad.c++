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


int main (){
    cout << factorial(2) << endl;
    cout << factorial(3) << endl;
    cout << factorial(4) << endl;
    return 0;
}
