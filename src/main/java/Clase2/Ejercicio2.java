package Clase2;


import java.util.Scanner;

/**
 *
 *
 * Comprobar si dos numeros son amigos. Dos numeros enteros positivos A y B son numeros amigos si la suma de los
 * divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.
 *
 *
 * @author LTintez
 *
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro numero entero: ");
        int num2 = scanner.nextInt();

        int sumaDivisoresNum1 = 1;
        for (int i = 2; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sumaDivisoresNum1 += i;
                System.out.print(", " + i);
            }
        }
        System.out.println(" - Suma de divisores propios de " + num1 + ": " + sumaDivisoresNum1);


        int sumaDivisoresNum2 = 1;
        for (int i = 2; i <= num2 / 2; i++) {
            if (num2 % i == 0) {
                sumaDivisoresNum2 += i;
                System.out.print(", " + i);
            }
        }
        System.out.println(" - Suma de divisores propios de " + num2 + ": " + sumaDivisoresNum2);

        if (sumaDivisoresNum1 == num2 && sumaDivisoresNum2 == num1) {
            System.out.println( "Los numeros ingresados son numeros amigos.");
        } else {
            System.out.println("Los numeros ingresados no son numeros amigos.");
        }
    }


}

