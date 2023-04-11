/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 09/04/2023
 * Fecha de Actualización: 09/04/2023
 * Descripción: Haga un algoritmo para una función que reciba dos parámetros
 *              N y K y que retorne los K dígitos más a la izquierda de N.
 *              Por ejemplo, extraerDigitos (542207, 2) debe retornar 54.
 */
package funciones;

public class Ejercicio_4 {

    // Función para extraer los K dígitos más a la izquierda de N
    public static int extraerDigitos(int n, int k) {
        // Convertir el número a un String para poder obtener los dígitos
        String strN = Integer.toString(n);
        // Verificar que el número de dígitos solicitados no sea mayor que el número total de dígitos
        if (k > strN.length()) {
            k = strN.length();
        }
        // Obtener los K dígitos más a la izquierda
        String strK = strN.substring(0, k);
        // Convertir los dígitos obtenidos de vuelta a un número entero
        int resultado = Integer.parseInt(strK);
        return resultado;
    }

    // Uso de la función en la funcion principal
    public static void main(String[] args) {
        int n = 542207;
        int k = 2;
        int resultado = extraerDigitos(n, k);
        System.out.println("Los " + k + " dígitos más a la izquierda de " + n + " son: " + resultado);
    }
}
