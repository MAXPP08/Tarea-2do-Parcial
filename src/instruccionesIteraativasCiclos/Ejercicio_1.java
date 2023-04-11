/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escribir un programa que pida al usuario un número entero
 *              positivo y muestre por pantalla todos los números impares 
 *              desde 1 hasta ese número.
 */
package instruccionesIteraativasCiclos;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos y guardamos datos
        System.out.println("Introduce un numero entero positivo: ");
        int numero = entrada.nextInt();
        // Hacemos el ciclo para imprimir
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.print(i+", ");
            }
        }
    }
}
