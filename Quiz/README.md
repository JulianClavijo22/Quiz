04 Generador de Patrones Numéricos Especiales
Escribe un programa que solicite al usuario un número entero positivo n y genere un patrón numérico especial. Para cada número k desde 1 hasta n, el programa debe generar una línea que contenga exactamente k veces el número k, pero alternando entre números positivos y negativos. Por ejemplo, para n = 4, el patrón debería ser:
1
2 -2
3 -3 3
4 -4 4 -4

Análisis del Problema
El objetivo es escribir un programa que solicite al usuario un número entero positivo n y genere un patrón numérico especial. Para cada número k desde 1 hasta n, el programa debe generar una línea que contenga exactamente k veces el número k, alternando entre números positivos y negativos

diseño
- Primero le solicitamos al usuario que ingrese un numero entero positivo, esto lo hacemos a traves del Scanner y lo guardamos en la variable num1.
- Para hacer un recorrido creamos un bucle for externo que inicia desde la variable i=1 hasta la variable num1 
- Ahora creamos un bucle for interno que inicie desde la variable j=0 hasta j=i donde i=1 
- imprimimos j

