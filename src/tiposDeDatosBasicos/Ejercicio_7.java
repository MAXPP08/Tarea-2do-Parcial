/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 04/04/2023
 * Fecha de Actualización: 04/04/2023
 * Descripción: Una juguetería tiene mucho éxito en dos de sus productos:
 *              payasos y muñecas. Suele hacer venta por correo y la empresa
 *              de logística les cobra por peso de cada paquete así que deben
 *              calcular el peso de los payasos y muñecas que saldrán en cada
 *              paquete a demanda. Cada payaso tiene un peso de 112 g y cada
 *              muñeca 75 g. Escribe un programa que lea el número de payasos y
 *              muñecas vendidos en el último pedido y calcule el peso total del
 *              paquete que será enviado
 */
package tiposDeDatosBasicos;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Dclaramos variables
        int payaso = 112, cantPayaso;
        int mona = 75, cantMona;
        int pesoTotal;
        // Pedimos y guardamos los datos
        System.out.println("Digite la cantidad de Payasos enviados: ");
        cantPayaso = entrada.nextInt();
        System.out.println("Digite la cantidad de Monas enviados: ");
        cantMona = entrada.nextInt();
        // Hacemos los calculos
        cantMona *= mona;
        cantPayaso *= payaso;
        pesoTotal = cantPayaso + cantMona;
        // Imprimimos el resultado
        System.out.println("El peso total a enviar es de " + pesoTotal + " g");
    }
}
