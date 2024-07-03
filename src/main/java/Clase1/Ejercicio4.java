package Clase1;

import java.util.Scanner;

/**
 *
 *
 * Programa que comprueba si un año es bisiesto. Un año es bisiesto si es
 * divisible por 4 y no lo es por 100 o si es divisible por 400.
 *
 *
 * @author LTintez
 *
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año que desea comprobar si es bisiesto o no: ");
        int anio = scanner.nextInt();

        if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
            System.out.println("El año ingresado es bisiesto");
        }
        else {
            System.out.println("El año ingresado no es bisiesto");
        }

    }
}
