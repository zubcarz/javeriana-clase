// 5.	Realice un programa que simule el lanzamiento de un dado
// a.	Una función para simular el lanzamiento de un dado (1,2,3,4,5,6)
// b.	Almacene en un arreglo de 6 posiciones, uno por cada cara del dado, el numero de repeticiones o la frecuencia con la que ocurre cada lanzamiento
// c.	Realice el experimento para
// i.	10 repeticiones
// ii.	100 repeticiones
// iii.	500 repeticiones
// iv.	1000 repeticiones
// v.	10000 repeticiones
// d.	Cree un método que calcule e imprima en pantalla la probabilidad de ocurrencia de cada cara del lado.
// e.	Resuelva el problema usando iteraciones a su vez resuelva el problema usando funciones recursivas.

#include "iostream"
#include <stdio.h>
#include <vector>
#include <string>

// Time lib
#include <time.h>
#include <chrono>
#include <sys/time.h>
#include <ctime>

// control process
#include <unistd.h>

using namespace std;
// Time definitions
using std::chrono::duration_cast;
using std::chrono::milliseconds;
using std::chrono::system_clock;

int const DICE_FACE = 6;

// Timestamp Method (chrono)
int throwDiceTime()
{
    int result = 0;
    auto millis = duration_cast<milliseconds>(system_clock::now().time_since_epoch()).count();
    cout << "semilla - >" << millis << endl;
    // waiting 1second
    usleep(1000);
    srand(millis);
    // generate random number
    return (rand() % DICE_FACE) + 1;
}

// Timestamp Method (Normal)
int throwDice(int *currentSeed)
{
    // srand((unsigned)time(0));
    // get seed
    int result = 0;

    int newSeed = (unsigned)time(NULL);
    if (*currentSeed != newSeed)
    {
        cout << "semilla - >" << newSeed << endl;
        srand(newSeed);
        // generate random number
        result = (rand() % DICE_FACE) + 1;
    }

    *currentSeed = newSeed;
    return result;
}

int main()
{
    int currentSeed = 0;
    int result = 0;

    for (int i = 0; i < 9000; i++)
    {
        result = throwDiceTime();

        cout << result << endl;
    }

    return 0;
}