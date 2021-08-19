
#include <stdio.h>

int main()
{
    int cuenta;      /* número de cuenta */
    char nombre[30]; /* nombre de cuenta */
    double saldo;    /* saldo de la cuenta */

    FILE *ptrCf; /* ptrCf = apuntador al archivo clientes.dat */

    if ((ptrCf = fopen("clientes.dat", "r")) == NULL)
    {
        printf("El archivo no pudo abrirse\n");
    }
    else
    {
        printf("%-10s%-13s%s\n", "Cuenta", "Nombre", "Saldo");
        fscanf(ptrCf, "%d%s%lf", &cuenta, nombre, &saldo);

        while (!feof(ptrCf))
        {
            printf("%-10d%-13s%7.2f\n", cuenta, nombre, saldo);
            fscanf(ptrCf, "%d%s%lf", &cuenta, nombre, &saldo);
        }

        fclose(ptrCf);
    }

    return 0;
}