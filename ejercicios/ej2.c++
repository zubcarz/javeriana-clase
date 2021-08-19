// (Ocho reinas.) Otro enigma para los amantes del ajedrez es el problema de las ocho reinas, el cual dice: ¿es posible
// colocar ocho reinas en un tablero de ajedrez vacío, de tal manera que ninguna reina ataque a otra, es decir, que
// dos reinas no estén en la misma fila, en la misma columna, o a lo largo de la misma diagonal? Utilice la idea desarrollada
// en el ejercicio 6.24 para formular la heurística para resolver el problema de las ocho reinas. Ejecute su
// programa. [Pista: Es posible asignar un valor a cada cuadro del tablero, que indique cuántos cuadros de un tablero
// vacío son “eliminados” si se coloca una reina en ese cuadro. Por ejemplo, a cada una de las esquinas se le asignaría
// el valor 22, como en la figura 6.26.]
// Una vez que estos “números de eliminación” se colocan en los 64 cuadros, una heurística adecuada podría ser: coloque
// la siguiente reina en el cuadro que tenga el número de eliminación más pequeño. ¿Por qué esta estrategia es
// intuitivamente atractiva?
// 6.27 (Ocho reinas: métodos de fuerza bruta.) En este ejercicio, usted desarrollará diversos métodos para resolver el problema
// de las ocho reinas que presentamos en el ejercicio 6.26.
// a) Resuelva el ejercicio de las ocho reinas, utilizando la técnica de la fuerza bruta aleatoria desarrollada en el ejercicio
// 6.25.
// b) Utilice una técnica exhaustiva, es decir, intente todas las posibles combinaciones de las ocho reinas en el tablero.
// c) ¿Por qué supone que el método exhaustivo de la fuerza bruta puede no resultar apropiado para resolver el problema
// del recorrido del caballo?
// d) Compare y contraste el método de la fuerza bruta aleatoria con el de la fuerza bruta exhaustiva en general.