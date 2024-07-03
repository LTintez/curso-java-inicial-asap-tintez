package Clase1;

import java.util.Scanner;

/**
 * Programa que pide por teclado la fecha de nacimiento de una persona (dia, mes, anio) y calcula su numero de la suerte.
 * El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento
 * y a continuacion sumando las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es 12/07/1980
 * Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
 * Numero de la suerte: 28
 *
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento. Primero debera ingresar el dia, luego el mes y el año");

        System.out.println("Ingrese el dia: ");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año: ");
        int anio = scanner.nextInt();

        int sumaFecha = dia + mes + anio;

        int primerCifra = sumaFecha / 1000;
        int segundaCifra = sumaFecha / 100 % 10;
        int tercerCifra = (sumaFecha / 10) % 10;
        int cuartaCifra = sumaFecha % 10;

        int numeroSuerte = primerCifra + segundaCifra + tercerCifra + cuartaCifra;

        System.out.println("Su numero de la suerte es: " + numeroSuerte);

    }

}
