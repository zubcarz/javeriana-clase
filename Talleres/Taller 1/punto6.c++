
#include "iostream"
#include <stdio.h>
#include <vector>
#include <string>
#include <time.h>

using namespace std;
struct User
{
    int id; // unique
    string lastname;
    string name;
    int age;

    int getAge()
    {
        return age;
    }

    int getId()
    {
        return id;
    }

    string getName()
    {
        return name;
    }

    string getLastname()
    {
        return lastname;
    }

    void createUser(int *vid, string vlastname, string vname, int vage)
    {
        *vid = *vid + 1;
        id = *vid;
        lastname = vlastname;
        name = vname;
        age = vage;
        cout << "User was create with id => " << id << endl;
    }

    void printCurrentUser()
    {
        cout << "id => " << id << endl;
        cout << "lastname => " << lastname << endl;
        cout << "name => " << name << endl;
        cout << "age => " << age << endl
             << endl;
    }
} user;

// punto A
void getUser(int *, int, vector<User> *);
//punto B
void getfrequencyAge();
//punto C
void addUser(int *, string, string, int, vector<User> *, bool);
//punto D
void deleteUser(int, vector<User> *);
//punt E
void printDB();

// write one register
void writeUser(User);
// get last id
void loadInitialData(int *, vector<User> *);
//simulate create user
void simlateCreateUsers(int *, vector<User> *);

const int EXIT_CASE = 7;

int main()
{

    // Declarations var
    int currentId = 0;
    // array dynamic
    vector<User> users;
    int option = 0, idQuery = 0;

    // temp info
    int age = 0;
    string name;
    string lastname;

    // Load db
    loadInitialData(&currentId, &users);
    cout << "Inicial Id = " << currentId << endl;

    // Logic
    cout << "start program" << endl;
    while (option != EXIT_CASE && cin.good())
    {
        cout << string(20, '*') << endl;
        cout << "Plese select a option:" << endl;
        printf(" 1. Add user\n 2. Search user\n 3. Get age Frecuency\n 4. delete user\n 5. add printdb\n 6. Delete db\n 7. End Program\n");
        cout << string(20, '*') << endl;
        cin >> option;

        switch (option)
        {
        case 0:
            simlateCreateUsers(&currentId, &users);
            break;
        case 1:
            cout << string(20, '*') << endl;
            cout << "Add new User" << endl;
            cout << string(20, '*') << endl;

            // Get data user
            cout << "Please digit a name:" << endl;
            cin >> name;
            cout << "Please digit a lastname:" << endl;
            cin >> lastname;

            // TODO check age range
            cout << "Please enter the age between 18 and 45:" << endl;
            cin >> age;

            // Result
            // Change color of console to green
            system("Color 02");
            cout << string(20, '=') << endl
                 << string(20, '=') << endl;
            addUser(&currentId, name, lastname, age, &users, true);
            cout << "Db has " << users.size() << " registers" << endl;
            cout << string(20, '=') << endl
                 << string(20, '=') << endl;
            // press any key to continued
            system("pause");
            // Change color of console to white
            system("Color 07");
            break;
        case 2:
            cout << "Please digit a id of user:" << endl;
            cin >> idQuery;
            // Result
            // Change color of console to green
            system("Color 02");
            getUser(&currentId, idQuery - 1, &users);
            // press any key to continued
            system("pause");
            // Change color of console to white
            system("Color 07");
            break;
        case 3:
            cout << "caso 3" << endl;
            break;
        case 4:
            cout << "Please digit a id of user:" << endl;
            cin >> idQuery;
            // Result
            // Change color of console to green
            system("Color 02");
            deleteUser(idQuery - 1, &users);
            cout << "the element was erase" << endl;
            // press any key to continued
            system("pause");
            // Change color of console to white
            system("Color 07");
            break;
        case EXIT_CASE:
            cout << "Thanks for use the CRUD" << endl;
            break;
        default:
            cout << option << " is not a valid option" << endl;
            break;
        }
    }
    return 0;
}

void loadInitialData(int *idRef, vector<User> *users)
{
    cout << "LOADING DB" << endl;
    char name[100], lastname[100];
    int id = 0, age;
    int lastId = 0;
    bool isEndline = false;

    FILE *fp;
    fp = fopen("db.dat", "r");
    while (!isEndline)
    {
        lastId = id;
        fscanf(fp, "%d %s %s %d", &id, name, lastname, &age);
        cout << lastId << "- " << id << endl;
        if (lastId != id)
        {
            cout << id << "-" << name << endl;
            addUser(idRef, (string)name, (string)lastname, age, users, false);
        }
        else
        {
            cout << "Db has " << users->size() << " registers" << endl;
            isEndline = true;
        }
    }

    fclose(fp);
}

void writeUser(User user)
{
    // TODO load data from DB FILE
    // pointer to file .bat -> stdio.h
    cout << "create registe in db" << endl;
    FILE *ptrCf;

    // a to append mode
    if ((ptrCf = fopen("db.txt", "a")) == NULL)
    {
        printf("The file cannot open \n");
    }
    else
    {
        fprintf(ptrCf, "%d %s %s %d\n", user.getId(), user.getLastname().c_str(), user.getName().c_str(), user.getAge());
    }

    fclose(ptrCf);
    cout << "End registe in db" << endl;
}

void simlateCreateUsers(int *idRef, vector<User> *users)
{
    int age;

    // start seed
    srand(time(NULL));

    for (int i = 0; i < 1000; i++)
    {
        /* generate secret number between 18 and 45: */
        age = (rand() % 27) + 18;
        addUser(idRef, "carlos", "Leon", age, users, true);
    }
}

// punto A
// TODO
void getUser(int *idRef, int position, vector<User> *users)
{
    try
    {
        if ((*idRef > position) && (position > 0))
        {
            users->at(position).printCurrentUser();
        }
        else
        {
            throw(position);
        }
    }
    catch (int position)
    {
        cout << "id " << position + 1 << " is not valid\n";
    }
}

//punto B
void getfrequencyAge()
{
    // agrupar

    // ordenar

    // call max

    // draw frecuency
}

//punto C
void addUser(int *currentId, string name, string lastname, int age, vector<User> *users, bool write)
{

    // crear user
    user.createUser(currentId, name, lastname, age);
    // Add REGISTER to db.bat
    if (write)
    {
        writeUser(user);
    }
    // -> operator to access attribute of a pointer
    //* add user to vector
    users->push_back(user);
}

//punto D
void deleteUser(int position, vector<User> *users)
{
    users->erase(users->begin() + position);
}

//punt E
void printDB()
{
}