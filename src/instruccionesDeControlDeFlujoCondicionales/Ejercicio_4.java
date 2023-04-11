/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 06/04/2023
 * Fecha de Actualización: 06/04/2023
 * Descripción: El IMC resulta de la división de la masa del individuo 
 *              (en kilogramos) entre el cuadrado de la estatura (en metros). 
 *              El índice de masa corporal es un indicador del peso de una 
 *              persona en relación con su altura
 * 
 *              Clasificación del IMC de acuerdo con la OMS de la ONU:
 *                      1. Menor a 16:      Criterio de ingreso. 
 *                      2. 16 a 16.9:       infrapeso.    
 *                      3. 17 a 18.4:       bajo peso.    
 *                      4. 18.5 a 24.9:     peso normal.    
 *                      5. 25 a 29.9:       sobrepeso.    
 *                      6. 30 a 34.9:       obesidad premórbida.  
 *                      7. 40 a 45:         obesidad mórbida.   
 *                      8. Mayor a 45:      obesidad hipermórbida.
 */
package instruccionesDeControlDeFlujoCondicionales;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Pedimos y guardamos datos
        System.out.println("Ingresa tu peso en kilogramos: ");
        float peso = entrada.nextFloat();
        System.out.println("Ingresa tu altura en metros: ");
        float altura = entrada.nextFloat();
        // Hacemos la respectiva operacion
        double imc = peso/(Math.pow(altura, 2));
        
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
