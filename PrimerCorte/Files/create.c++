// sistema de gestion de cuentas por pagar

#include <stdio.h>
int main()
{
    // Definicion de variables
    int cuenta;
    char nombre[30];
    double saldo;
    

    // apuntador gestor archivos .bat -> stdio.h
    FILE *ptrCf; 
    
    /* fopen abre el archivo. Si no es capaz de crear el archivo, sale del grama */
    if ((ptrCf = fopen("clientes.dat", "wb")) == NULL)
    {
        printf("El archivo no pudo abrirse\n");
    } 
    else
    {
        printf("Introduzca la cuenta, el nombre, y el saldo.\n");
        printf("Introduzca EOF al final de la entrada.?\n");
       
        scanf("%d %s %lf", &cuenta, nombre, &saldo);

        /* escribe la cuenta, el nombre y el saldo dentro del archivo con fprintf */
        while (saldo != 0)
        {
            // escribir linea en el archivo bat
            fprintf(ptrCf, "%d %s %.2f\n", cuenta, nombre, saldo);
            //(direcicion de archivo, "formatos datos", n datos )

            // solicitar nuevos datos
            scanf("%d %s %lf", &cuenta, nombre, &saldo);
        }              
        fclose(ptrCf); 
    }                  
    return 0;          
} 