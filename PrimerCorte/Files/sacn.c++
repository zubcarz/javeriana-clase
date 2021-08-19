#include <stdio.h>
#include <math.h>
#define TAM_MAXIMO 80

int main(void)
{
  char cadena[TAM_MAXIMO];
  int entero1, entero2;
  float decimal;

  printf("Introduce dos enteros separados por un espacio: \n");
  scanf("%d %d", &entero1, &entero2);

  printf("Introduce un número decimal:\n");
  scanf("%f", &decimal);

  printf("Introduce una cadena:\n");
  scanf("%s",cadena);

  printf("Esto es todo lo que has escrito:\n");
  printf("%d %d %f %s\n",entero1,entero2,decimal,cadena);

  return 0;
}