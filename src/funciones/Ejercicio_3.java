/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 09/04/2023
 * Fecha de Actualización: 09/04/2023
 * Descripción: Haga una función para determinar si un punto (X, Y) está dentro
 *              de un rectángulo. El rectángulo es definido por la coordenada
 *              del vértice superior izquierdo, su altura y su ancho.
 */
package funciones;

public class Ejercicio_3 {

    // Función para determinar si un punto está dentro de un rectángulo
    public static boolean puntoEnRectangulo(int x, int y, int rectX, int rectY, int rectAncho, int rectAltura) {
        if (x >= rectX && x <= rectX + rectAncho && y >= rectY && y <= rectY + rectAltura) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Declaramos variables
        int x = 3;
        int y = 5;
        int rectX = 2;
        int rectY = 4;
        int rectAncho = 8;
        int rectAltura = 6;
        // llamamos a la funcion e imprimimos el resultado final
        if (puntoEnRectangulo(x, y, rectX, rectY, rectAncho, rectAltura)) {
            System.out.println("El punto (" + x + ", " + y + ") está dentro del rectángulo.");
        } else {
            System.out.println("El punto (" + x + ", " + y + ") está fuera del rectángulo.");
        }
    }
}
