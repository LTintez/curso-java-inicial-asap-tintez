package Clase3;

import com.github.sanchezih.util.io.Consola;

/*
 *
 * Ejercicio03
 *Programa que pide 5 numeros enteros, los almacena en un array, e indica por pantalla si dicho
 *array es capicua.
 *
 * @author LTintez
 *
 * */

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = Consola.leerEntero();
        }

        boolean esCapicua = true;
        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esCapicua = false;
                break;
            }
        }

        if (esCapicua) {
            System.out.println("El arreglo es capicua");
        } else {
            System.out.println("El arreglo no es capicua.");
        }

    }

}
