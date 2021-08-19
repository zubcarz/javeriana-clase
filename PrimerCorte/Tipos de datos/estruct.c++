#include <iostream>
using namespace std;

struct stPareja {
   int A, B;
   int result;
   int LeeA() { return A;} // Devuelve el valor de A
   int LeeB() { return B;} // Devuelve el valor de B
   void GuardaA(int n) { A = n;} // Asigna un nuevo valor a A
   void GuardaB(int n) { B = n;} // Asigna un nuevo valor a B
   int addAB(){ return result = A + B; }
} Par;

int main() {
   
   Par.GuardaA(15);
   Par.GuardaB(63);
   
   // cout << Par.LeeA() << endl;
   // cout << Par.LeeB() << endl;
   // cout << Par.addAB() << endl;

   return 0;
}