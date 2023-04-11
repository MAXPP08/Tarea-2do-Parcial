/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escriba un programa que, dadas las longitudes de los catetos de
 *              un triángulo rectángulo, calcule la longitud de su hipotenusa
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Dclaramos variables
        double cateto1, cateto2, hipotenusa;
        // Pedimos y guardamos los datos
        System.out.println("Ingrese un valor para el Cateto 1: ");
        cateto1 = entrada.nextFloat();
        System.out.println("Ingrese un valor para el Cateto 2: ");
        cateto2 = entrada.nextFloat();
        // Hacemos los calculos
        hipotenusa = Math.pow(cateto1, 2)+Math.pow(cateto2, 2);
        // Imprimimos el resultado
        System.out.println("La longitud de la Hipotenusa es: " + hipotenusa);
    }
}
