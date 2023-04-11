/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 06/04/2023
 * Fecha de Actualización: 06/04/2023
 * Descripción: Escribir un programa que pida al usuario dos números y muestre
 *              por pantalla su división. Si el divisor es cero, el programa 
 *              debe mostrar un mensaje de error.
 */
package instruccionesDeControlDeFlujoCondicionales;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos y guardamos resultados
        System.out.println("Ingrese un numero (Dividendo): ");
        double dividendo = entrada.nextDouble();
        System.out.println("Ingrese otro numero: (Divisor)");
        double divisor = entrada.nextDouble();
        // Hacemos el calculo
        double divicion = dividendo/divisor;
        // En condicionales mostramos los posibles resultados
        if (divisor == 0) {
            System.out.println("Error, El divisor no puede ser cero (0)");
        } else {
            System.out.println("El resultado de la divicion es: "+ divicion);
        }
    }
}
