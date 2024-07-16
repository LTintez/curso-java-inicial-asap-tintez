package Clase4;

import com.github.sanchezih.util.io.Consola;

/**
 * Programa que pide el ingreso de un numero e indica si es un numero primo o no.
 *
 * @author LTintez
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        int numero = Consola.leerEntero("Ingrese un numero: ");

        if (esPrimo(numero)) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

}
