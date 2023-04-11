/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 09/04/2023
 * Fecha de Actualización: 09/04/2023
 * Descripción: Haga una función que reciba como entrada un mes del año y
 *              determine el número de días transcurridos desde el comienzo del
 *              año hasta el primer día del mes.
 */
package funciones;

public class Ejercicio_2 {

    // Función para calcular el número de días transcurridos desde el comienzo del año hasta el primer día del mes
    public static int calcularDiasTranscurridos(int mes) {
        int diasTranscurridos = 0;
        switch (mes) {
            case 12:
                diasTranscurridos += 30; // Noviembre
            case 11:
                diasTranscurridos += 31; // Octubre
            case 10:
                diasTranscurridos += 30; // Septiembre
            case 9:
                diasTranscurridos += 31; // Agosto
            case 8:
                diasTranscurridos += 31; // Julio
            case 7:
                diasTranscurridos += 30; // Junio
            case 6:
                diasTranscurridos += 31; // Mayo
            case 5:
                diasTranscurridos += 30; // Abril
            case 4:
                diasTranscurridos += 31; // Marzo
            case 3:
                diasTranscurridos += 28; // Febrero (sin bisiesto)
            case 2:
                diasTranscurridos += 31; // Enero
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }
        return diasTranscurridos;
    }

    // Uso de la función
    public static void main(String[] args) {
        int mes = 3;
        int diasTranscurridos = calcularDiasTranscurridos(mes);
        System.out.println("El número de días transcurridos desde el comienzo del año hasta el primer día del mes " + mes + " es: " + diasTranscurridos);
    }
}
