package Clase1;

import java.util.Scanner;

/**
 * Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o de 3.
 *
 * @author LTintez
 *
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero entero: ");

        int num = scanner.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El numero ingresado es multiplo de 2 y 3");
        } else if (num % 2 == 0) {
            System.out.println("El numero ingresado es multiplo de 2");
        } else if (num % 3 == 0) {
            System.out.println("El numero ingresado es multiplo de 3");
        } else {
            System.out.println("El numero ingresado no es multiplo de 2 ni de 3");
        }

    }


}
