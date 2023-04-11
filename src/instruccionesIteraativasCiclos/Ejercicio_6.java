/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 05/04/2023
 * Fecha de Actualización: 05/04/2023
 * Descripción: Escribir un programa que solicite el ingreso de una cantidad 
 *              indeterminada de números mayores que 1, finalizando cuando se 
 *              reciba un cero. Imprimir la cantidad de números primos ingresados             
 */
package instruccionesIteraativasCiclos;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        // Iniciamos el ciclo
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (esPrimo(numero)) {
                count++;
            }
        }
        // Imprimimos resultados
        System.out.println("Cantidad de números primos ingresados: " + count);
    }
    // Método para saber si es primo o no
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
