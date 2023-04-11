/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Escriba un programa que lea un número de cuatro dígitos y 
 *              muestre en pantalla el número escrito en reverso. Por ejemplo, 
 *              si el número leído es 5432, la salida debería ser 2345.
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número de cuatro digitos: ");
        int num = entrada.nextInt();

        // Convertir el número a una cadena de texto y crear una cadena vacía para almacenar el número reverso
        String numStr = String.valueOf(num);
        String numReversoStr = "";

        // Iterar sobre los caracteres de la cadena de texto, empezando por el último y añadiéndolos a la cadena del número reverso
        for (int i = numStr.length() - 1; i >= 0; i--) {
            numReversoStr += numStr.charAt(i);
        }

        // Convertir la cadena del número reverso de nuevo a un número entero
        int numReverso = Integer.parseInt(numReversoStr);
        
        System.out.println("El numero ingresado es: " + num);
        System.out.println("El numero reverso es: " + numReverso);
    }
}
