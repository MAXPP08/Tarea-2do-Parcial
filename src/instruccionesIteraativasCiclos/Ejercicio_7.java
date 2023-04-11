/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 05/04/2023
 * Fecha de Actualización: 05/04/2023
 * Descripción: Leer números enteros positivos de teclado, hasta que el usuario
 *              ingrese el número cero e informar cuál fue el mayor y el menor
 *              número ingresado.
 */
package instruccionesIteraativasCiclos;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maximo = Integer.MIN_VALUE; // se inicializa con el valor mínimo para int
        int minimo = Integer.MAX_VALUE; // se inicializa con el valor máximo para int

        do {
            System.out.print("Ingrese un número entero positivo (0 para salir): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                // actualizar el máximo y el mínimo si corresponde
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }
        } while (numero != 0);
        // En las condicionales imprimimos los resultados
        if (maximo == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron números válidos.");
        } else {
            System.out.println("El número máximo ingresado es: " + maximo);
            System.out.println("El número mínimo ingresado es: " + minimo);
        }
    }
}
