
#include "iostream"
#include <vector>
using namespace std;

const int SIZE = 8;
int board[SIZE][SIZE];

// control process
#include <unistd.h>

using namespace std;
// Time lib
#include <time.h>
#include <chrono>
#include <sys/time.h>
#include <ctime>

// Time definitions
using std::chrono::duration_cast;
using std::chrono::milliseconds;
using std::chrono::system_clock;

// 0 Espacio vacio
// 1 Reina
// 2 Espacio bloqueado

int getRamdom(int range)
{
    auto millis = duration_cast<milliseconds>(system_clock::now().time_since_epoch()).count();
    usleep(1000);
    srand(millis);
    // generate random number
    return (rand() % range);
}

void initBoard()
{

    for (int i = 0; i < SIZE; i++)
    {
        for (int j = 0; j < SIZE; j++)
        {
            board[i][j] = 0;
        }
    }
}

void printRender()
{
    for (int i = 0; i < SIZE; i++)
    {
        for (int j = 0; j < SIZE; j++)
        {
            cout << board[i][j] << " ";
        }
        cout << endl;
    }
}

bool checkColumn(int column)
{
    bool isValid = true;
    for (int j = 0; j < SIZE; j++)
    {
        if (board[j][column] == 1)
        {
            isValid = false;
        }
    }
    return isValid;
}

bool checkRow(int row)
{
    bool isValid = true;
    for (int j = 0; j < SIZE; j++)
    {
        if (board[row][j] == 1)
        {
            isValid = false;
        }
    }
    return isValid;
}

bool checkDig(int row, int column)
{
    bool isValid = true;
    int rowMove = row;
    int columnMove = column;

    // first digonal
    do
    {
        rowMove = rowMove - 1;
        columnMove = columnMove - 1;
        if (board[rowMove][columnMove] == 1)
        {
            isValid = false;
        }
    } while (rowMove > 0 && columnMove > 0);

    // second digonal
    rowMove = row;
    columnMove = column;
    do
    {
        rowMove = rowMove - 1;
        columnMove = columnMove + 1;
        if (board[rowMove][columnMove] == 1)
        {
            isValid = false;
        }
    } while (rowMove > 0 && columnMove < SIZE);

    return isValid;
}

void aprox2Move1(int row)
{
    // iniciar aleatoria mente, en la fila indicada una reina
    board[row][getRamdom(SIZE)] = 1;
}

bool aprox2Move2(int row)
{
    bool result = false;
    vector<int> avaliblePositions;
    int select = 0;
    // guardar posiciones del vector
    // elegir las posiciones del vector guardadas

    for (int j = 0; j < SIZE; j++)
    {
        // verificar si
        if (checkColumn(j) == true && checkRow(row) == true && checkDig(row, j) == true)
        {
            avaliblePositions.push_back(j);
        }
    }

    if (avaliblePositions.size() > 0)
    {
        select = getRamdom(avaliblePositions.size());
        board[row][avaliblePositions.at(select)] = 1;
        result = true;
    }

    return result;
}

int main()
{

    bool isValidMove = true;
    bool isSolved = false;
    int iteration = 0;

    while (isSolved == false)
    {
        initBoard();
        cout << "iteration " << iteration << endl;
        for (int move = 0; move < SIZE; move++)
        {

            if (move == 0)
            {
                aprox2Move1(0);
                // printRender();
            }
            else
            {
                isValidMove = aprox2Move2(move);
                if (isValidMove == false)
                {
                    // cout << "End testing" << endl;
                    // cout << "*****************" << endl;
                    // cout << move << ". movimiento" << endl;
                    // printRender();
                    break;
                }

                if (move == 7 && isValidMove == true)
                {
                    cout << "Winner" << endl;
                    cout << "*****************" << endl;
                    printRender();
                    cout << "*****************" << endl;
                    isSolved = true;
                }
            }
        }
        iteration++;
    }
    return 0;
}
