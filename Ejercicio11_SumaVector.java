package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 11: Leer n valores enteros en un arreglo y sumar sus elementos recursivamente.
 */
public class Ejercicio11_SumaVector {

    public static int sumaVector(int[] arr, int indice) {
        if (indice == arr.length) return 0;
        return arr[indice] + sumaVector(arr, indice + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos elementos desea ingresar? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Ingrese los " + n + " valores:");
        for (int i = 0; i < n; i++) {
            System.out.print("  Elemento [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int suma = sumaVector(arr, 0);
        System.out.println("Suma de los elementos del vector = " + suma);
        sc.close();
    }
}
