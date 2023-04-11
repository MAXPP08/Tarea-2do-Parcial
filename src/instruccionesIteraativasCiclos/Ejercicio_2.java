/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 05/04/2023
 * Fecha de Actualización: 05/04/2023
 * Descripción: Escribir un programa que pida al usuario un número entero y 
 *              muestre por pantalla si es un número primo o no.
 */
package instruccionesIteraativasCiclos;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos y guardamos datos
        System.out.println("Ingrese un numero entero: ");
        int numero = entrada.nextInt();
        // Declaramos una bandera
        boolean esPrimo = true;
        // Hacemos el proceso para saber si es primo o no
        for (int i = 2; i <= numero/2; i++) {
            if (numero % 2 == 0) {
                esPrimo = false;
            }
        }
        // Imprimimos el resultado final
        if (esPrimo) {
            System.out.println(numero+ " es primo");
        } else {
            System.out.println(numero+ " NO es primo");
        }
    }
}
