 // (Ocho reinas.) 

// Metodo 1
    // 0.    crear el tablero
    // 0.1 crear todas las combinas de colocar por cada columna una reina
    // 0.2 Verificar si todo el tablero. cumple la condicion. 
    // 0.3 contabiliazar todas las opciones posibles

// Metodo 2
    // 1. crear el tablero
    // 1.1 colocar una reina en la primera columna
    // 1.2 colocar una segunda reina en una posicion posible
    // 1.3 Repetir desde el paso 1.1 hasta hallar una solucion posible.

// Metodo 3
    // 2. crear el tablero
    // 2.1 ubicar reina aleatoria mente en primera columna
    // 2.1 para la segunda reina ubicar una lado y (+ -) dos
    // 2.3 Verificas si la reina colocada esta en una posicion correcta
    // 2.4 Repetir el proceso

00000001 -> 1 
00000010 -> 2 
00000100 -> 3 
00001000 -> 4 
00010000 -> 5 
00100000 -> 6  
01000000 -> 7 
10000000 -> 8 

40319 combinaciones validas fila y columna 0,002281%
16686 validando diagonales cercanas hacia delante 0,005%x|

x?? soluciones posibles descartando las diagonales
92 soluciones validas para reinas
12 no petidas