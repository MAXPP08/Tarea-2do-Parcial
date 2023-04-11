/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escriba un programa que reciba como entrada los coeficientes 
 *              A, B y C de una ecuación de segundo grado, e imprima por 
 *              pantalla los valores de x. Asuma que la ecuación siempre tiene 
 *              solución en número reales. Recuerde que la solución de una 
 *              ecuación de segundo viene dada por: X = -b +- √b2-4ac  / 2a
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Dclaramos variables
        double a,b,c, discriminante, x1, x2;
        // Pedimos y guardamos los datos
        System.out.println("Ingrese un valor para 'a': ");
        a = entrada.nextDouble();
        System.out.println("Ingrese un valor para 'b': ");
        b = entrada.nextDouble();
        System.out.println("Ingrese un valor para 'c': ");
        c = entrada.nextDouble();
        // Hacemos los calculos
        discriminante = Math.pow(b, 2) - 4*(a*c);
        
        if (discriminante < 0) {
            System.out.println("No existe una solucion real");
        } else if (discriminante == 0){
            x1 = -b + (Math.sqrt(discriminante)) / (2*a);
            x2 = -b - (Math.sqrt(discriminante)) / (2*a);
            System.out.println("Existe una solucion unica 'x1' y 'x2' son iguales. 'x1' es igual a " +x1+ ", 'x2' es igual a "+ x2);
        } else if (discriminante > 0){
            x1 = (-b + Math.sqrt(discriminante)) / (2*a);
            x2 = (-b - Math.sqrt(discriminante)) / (2*a);
            System.out.println("Hay 2 soluciones para 'x1' y 'x2'. 'x1' es igual a " +x1+ ", 'x2' es igual a "+ x2);
        }
    }
}
