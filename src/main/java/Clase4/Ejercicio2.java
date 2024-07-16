package Clase4;

import java.util.Random;

/**
 * Programa que genera un array de 8 enteros aleatorios entre 1 y 10, lo ordena utilizando el
 * algoritmo de ordenamiento de burbuja y lo muestra.
 *
 * @author LTintez
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] array = new int[8];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10) + 1;
        }

        System.out.println("Array original:");
        mostrarArray(array);

        ordenamientoBurbuja(array);

        System.out.println("\nArray ordenado:");
        mostrarArray(array);
    }

    static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void ordenamientoBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
