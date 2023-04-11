/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 09/04/2023
 * Fecha de Actualización: 09/04/2023
 * Descripción:  Escribir una función que calcule el área de un círculo y otra
 *              que calcule el volumen de un cilindro usando la primera función.
 */
package funciones;

public class EJercicio_1 {
    // Función para calcular el área de un círculo

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Función para calcular el volumen de un cilindro usando la función anterior
    public static double calcularVolumenCilindro(double radio, double altura) {
        double areaBase = calcularAreaCirculo(radio);
        return areaBase * altura;
    }

    // Uso de las funciones en la funcion principal
    public static void main(String[] args) {
        double radio = 5.0;
        double altura = 10.0;

        double areaCirculo = calcularAreaCirculo(radio);
        System.out.println("El área del círculo es: " + areaCirculo);

        double volumenCilindro = calcularVolumenCilindro(radio, altura);
        System.out.println("El volumen del cilindro es: " + volumenCilindro);
    }
}
