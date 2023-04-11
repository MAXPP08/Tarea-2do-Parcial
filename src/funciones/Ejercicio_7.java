/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 09/04/2023
 * Fecha de Actualización: 09/04/2023
 * Descripción: Solicitar números al usuario hasta que ingrese el cero. Por cada
 *              uno, mostrar la suma de sus dígitos. Al finalizar, mostrar la
 *              sumatoria de todos los números ingresados y la suma de sus
 *              dígitos. Reutilizar la misma función realizada en el Ejercicio N°8.
 */
package funciones;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, sumaDigitos, sumaTotal = 0, sumaTotalDigitos = 0;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = sc.nextInt();
            sumaDigitos = sumarDigitos(numero);
            sumaTotal += numero;
            sumaTotalDigitos += sumaDigitos;
            System.out.printf("La suma de los dígitos de %d es %d.%n", numero, sumaDigitos);
        } while (numero != 0);
        // Imprimimos los resultados
        System.out.printf("La suma total de los números ingresados es %d.%n", sumaTotal);
        System.out.printf("La suma total de los dígitos de los números ingresados es %d.%n", sumaTotalDigitos);
    }
    // Funcion o método para sumar los digitos
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}
