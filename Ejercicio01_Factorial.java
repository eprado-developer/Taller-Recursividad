package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 1: Calcular el factorial de un número usando recursividad.
 */
public class Ejercicio01_Factorial {

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero no negativo: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            System.out.println("Factorial de " + n + " = " + factorial(n));
        }
        sc.close();
    }
}
