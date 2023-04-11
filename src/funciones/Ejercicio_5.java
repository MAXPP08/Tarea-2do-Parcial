/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 09/04/2023
 * Fecha de Actualización: 09/04/2023
 * Descripción: Escribir un programa que pida números positivos al usuario.
 *              Mostrar el número cuya sumatoria de dígitos fue mayor y la
 *              cantidad de números cuya sumatoria de dígitos fue menor que 10.
 *              Utilizar una o más funciones, según sea necesario.
 */
package funciones;

import java.util.Scanner;

public class Ejercicio_5 {

    // Función para calcular la sumatoria de los dígitos de un número
    public static int sumatoriaDigitos(int numero) {
        int sumatoria = 0;
        while (numero > 0) {
            int digito = numero % 10;
            sumatoria += digito;
            numero /= 10;
        }
        return sumatoria;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayorSumatoria = 0; // Inicializamos la mayor sumatoria a cero
        int numeroMayorSumatoria = 0; // Inicializamos el número mayor sumatoria a cero
        int cantidadMenorDiez = 0; // Inicializamos la cantidad de números menores a diez a cero

        System.out.println("Ingrese números positivos (0 para salir): ");
        int numero = sc.nextInt();

        while (numero != 0) {
            int sumatoria = sumatoriaDigitos(numero);
            if (sumatoria > mayorSumatoria) {
                mayorSumatoria = sumatoria;
                numeroMayorSumatoria = numero;
            }
            if (sumatoria < 10) {
                cantidadMenorDiez++;
            }
            numero = sc.nextInt();
        }

        System.out.println("El número con mayor sumatoria de dígitos es: " + numeroMayorSumatoria);
        System.out.println("La cantidad de números cuya sumatoria es menor que 10 es: " + cantidadMenorDiez);
    }
}
