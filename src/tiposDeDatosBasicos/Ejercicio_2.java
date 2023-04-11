/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escribir un programa que realice la siguiente operación aritmética:
 *              (x+y) / (a * b)
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Dclaramos variables
        float x,y,a,b, resultado;
        // Pedimos y guardamos los datos
        System.out.println("Ingrese un valor para 'x': ");
        x = entrada.nextFloat();
        System.out.println("Ingrese un valor para 'y': ");
        y = entrada.nextFloat();
        System.out.println("Ingrese un valor para 'a': ");
        a = entrada.nextFloat();
        System.out.println("Ingrese un valor para 'b': ");
        b = entrada.nextFloat();
        // Hacemos los calculos
        resultado = (x + y) / (a * b);
        // Imprimimos el resultado
        System.out.println("El resultado de la operacion es: "+resultado);
    }
}
