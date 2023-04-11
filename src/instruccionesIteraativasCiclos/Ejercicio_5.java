/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 05/04/2023
 * Fecha de Actualización: 05/04/2023
 * Descripción: Dado un valor n, utilizar ciclos para calcular el valor de la expresión:
 *
 */
package instruccionesIteraativasCiclos;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedimos y guardamos datos
        System.out.print("Ingrese un valor para n: ");
        int n = sc.nextInt();

        double resultado = 0.0;
        // Hacemos el ciclo para calcular la exprecion
        for (int i = 1; i <= n; i++) {
            double pi = 1.0;
            for (int j = 1; j <= i; j++) {
                pi *= j;
            }
            resultado += pi / Math.pow(i, 2);
        }
        // Imprimimos el resultado
        System.out.println("El resultado de la expresión es: " + resultado);
    }
}
