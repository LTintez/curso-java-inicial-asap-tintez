package Clase2;
/**
 *
 *
 * Programa que muestra los N primeros numeros de la serie de Fibonacci. El valor de N se lee por teclado.
 *
 * La serie de fibonacci la forman una serie de numeros tales que:
 * El primer termino de la serie es el numero 1. El segundo termino de la serie es el numero 1.
 * Los siguientes terminos de la serie de fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…
 *
 *
 * @author LTintez
 *
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int i = 0;
        int j = 1;
        int k = 20; //Cantidad de numeros de la serie a generar

        System.out.println("Serie Fibonacci");

        for(int h = 1; h <= k; h++){

            System.out.println( i + " ");

            int nextNum = i + j;
            i = j;
            j = nextNum;
        }

    }

}
