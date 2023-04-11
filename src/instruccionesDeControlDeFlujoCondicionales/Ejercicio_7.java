/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 06/04/2023
 * Fecha de Actualización: 06/04/2023
 * Descripción: Un número de cuatro cifras es feliz si los dos primeros dígitos
 *              son mayores que los dos últimos dígitos. Por ejemplo, 5613 es
 *              feliz porque 56 es mayor que 12. Un número de cuatro cifras es
 *              creciente si cada dígito es mayor al anterior. Por ejemplo,
 *              1569 es creciente 1 < 5 < 6 < 9 (o 9 > 6 > 5 > 1). Todo número 
 *              que es feliz y creciente se dice que es un número muy feliz. 
 *              Todo número que no es feliz ni creciente se dice que es infeliz.
 *              Haga un programa que tome como entrada un número de cuatro 
 *              dígitos e imprima el tipo de número encontrado, según la 
 *              clasificación descrita.
 */
package instruccionesDeControlDeFlujoCondicionales;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos y Guardamos datos
        System.out.println("Ingrese un numero de 4 digitos: ");
        int numero = entrada.nextInt();
        // Hacemos la respectiva operacion aritmetica
        int primerosDigitos = numero / 100;
        int segundosDigitos = numero % 100;
        // Deacuerdo sea el caso inprimos el resultado
        if (primerosDigitos > segundosDigitos) {
            System.out.println("ES FELIZ");
        } else {
            System.out.println("NO ES FELIZ");
        }
        // Hacemos las operaciones aritmeticas necesarias para saber si es creciente o no
        int primerDigito = numero / 1000;
        int segundoDigito = (numero / 100) % 10;
        int tercerDigito = (numero / 10) % 10;
        int cuartoDigito = numero % 10;

        if (primerDigito < segundoDigito && segundoDigito < tercerDigito && tercerDigito < cuartoDigito) {
            System.out.println("ES CRECIENTE");
        } else {
            System.out.println("NO ES CRECIENTE");
        }

    }
}
