/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Dados dos valores X e Y que forman un intervalo cerrado, 
 *              y un valor W, realice un programa para determinar si W está 
 *              dentro o fuera del intervalo.
 */
package instruccionesDeControlDeFlujoCondicionales;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos y guardamos datos
        System.out.println("Ingrese un valor para abrir el intervalo: ");
        int x = entrada.nextInt();
        System.out.println("Ingrese un valor para cerrar el intervalo: ");
        int y = entrada.nextInt();
        System.out.println("Ingrese un valor para saber si esta dentro o fuera del intervalo: ");
        float w = entrada.nextFloat();
        // En la condicion hacemos las respectivas comparaciones
        if (x < w && y > w) {
            System.out.println(w + " esta dentro del intervalo de " + x +" y "+ y);
        } else {
            System.out.println(w + " NO esta dentro del intervalo de " + x +" y "+ y);
        }
    }
}
