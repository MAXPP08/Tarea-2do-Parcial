/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 06/04/2023
 * Fecha de Actualización: 06/04/2023
 * Descripción: Para tributar un determinado impuesto se debe ser mayor de 
 *              16 años y tener unos ingresos iguales o superiores a 500$ 
 *              mensuales. Escribir un programa que pregunte al usuario su edad
 *              y sus ingresos mensuales y muestre por pantalla si el usuario 
 *              tiene que tributar o no.
 */
package instruccionesDeControlDeFlujoCondicionales;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos y Guardamos datos
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el monto de su ingreso mensual: ");
        int ingreso = entrada.nextInt();
        // Imprimimos los posibles resultados segun sea el caso
        if (edad < 17) {
            System.out.println("No puedes tributar");
        } else if (edad > 16 && ingreso < 500){
            System.out.println("Tienes la edad suficiente pero tus igresos son bajos");
        } else if(edad > 16 && ingreso >= 500){
            System.out.println("Eres apto para Tributar");
        }
    }
}
