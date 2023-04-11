/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 09/04/2023
 * Fecha de Actualización: 09/04/2023
 * Descripción: Solicitar números al usuario hasta que ingrese el cero. Por cada
 *              uno, mostrar la suma de sus dígitos (utilizando una función que
 *              realice dicha suma).
 */
package funciones;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sumaDigitos;
        do {
            System.out.print("Ingrese un número (0 para salir): ");
            num = sc.nextInt();
            sumaDigitos = sumarDigitos(num);
            System.out.println("La suma de los dígitos es: " + sumaDigitos);
        } while (num != 0);
        sc.close();
    }

    // Función para sumar los dígitos de un número
    public static int sumarDigitos(int num) {
        int suma = 0;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}
