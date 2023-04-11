/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 06/04/2023
 * Fecha de Actualización: 06/04/2023
 * Descripción: Escriba un programa que dado el peso de una persona en libras 
 *              (1 libra = 0.453592 Kg) y su estatura en centímetros, calcule 
 *              su IMC e indique como salida el peso en kilogramos, el valor de 
 *              IMC de la persona y la categoría en la cual fue clasificado.
 */
package instruccionesDeControlDeFlujoCondicionales;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos y guardamos datos
        System.out.println("Ingrese su Peso en Libras: ");
        double pesoLibra = entrada.nextDouble();
        System.out.println("Ingrese su Altura en centimetros: ");
        double alturaCentimetros = entrada.nextDouble();
        // Hacemos las operaciones
        double imc = (pesoLibra/2.205) / Math.pow(alturaCentimetros/100, 2);
        
        System.out.println("Tu IMC es de: " + imc);
        // Mostramos los resultados segun sea el caso
        if (imc < 16) {
            System.out.println("Criterio de Ingreso");
        } else if(imc >= 16 && imc <= 16.9){
            System.out.println("Infrapeso");
        } else if(imc >= 17 && imc <= 18.4){
            System.out.println("Bajo Perso");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso Normal");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        } else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidad Premordida");
        } else if(imc >= 40 && imc <= 45){
            System.out.println("Obesidad Morbida");
        } else if(imc >= 45 && imc > 45){
            System.out.println("Obesidad Hipermorbida");
        }
    }
}
