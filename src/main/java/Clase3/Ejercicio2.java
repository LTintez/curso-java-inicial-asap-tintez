package Clase3;

import com.github.sanchezih.util.io.Consola;

/*
 *
 * Ejercicio02
 *Programa que pide 10 numeros por teclado, los almacena en un array y que luego muestra el
 *maximo valor, el minimo y las posiciones que ocupan en el array.
 *
 * @author LTintez
 *
 * */

public class Ejercicio2 {
    public static void main(String[] args) {

        //Inicializo el array que contendra 10 numeros.
        int[] numeros = new int[10];

        // Uso un for para recorrer los indices de numero y le aplico los valores leidos por la clase leerEntero
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i +1 ) + ": ");
            numeros[i] = Consola.leerEntero();
        }

        // Inicializo minimo con el valor del primer numero ingresado
        // Recorro el array remplazando minimo.


        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros [i];
            }
        }


        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros [i];
            }
        }

        // recorro el array buscando e imprimiendo la posicion donde encuentro minimo.
        System.out.println("El valor minimo es: " + minimo);
        System.out.println("El valor minimo se encuentra en las posiciones: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == minimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // deja un espacio en la consola para más prolijidad

        System.out.println("El valor maximo es: " + maximo);
        System.out.println("El valor maximo se encuentra en las posiciones: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maximo) {
                System.out.print(i + " ");
            }
        }

    }

}
 
 