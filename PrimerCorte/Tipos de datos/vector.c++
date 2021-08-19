#include <iostream>
#include <vector>
using namespace std;

vector<int> lista;

void muestraPosicion(vector<int> &parametro, int index) {
    cout << "position" << endl;
    cout << parametro[index];
}

int main() {
    lista = { '6', '8', '7', '3', '2', '8', '9', '3'};
    int posicion;

    cout << "Write the position" << endl;
    cin >> posicion;
    muestraPosicion(lista, posicion);
}

