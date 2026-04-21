package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 14: Función de Ackermann.
 * Ackermann(m, n) = n + 1                          si m = 0
 * Ackermann(m, n) = Ackermann(m - 1, 1)            si m > 0 y n = 0
 * Ackermann(m, n) = Ackermann(m - 1, Ackermann(m, n - 1)) si m > 0 y n > 0
 *
 * Ejemplos: Ackermann(1, 2) = 4;  Ackermann(3, 2) = 29
 */
public class Ejercicio14_Ackermann {

    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (m > 0 && n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de m (se recomienda m <= 3): ");
        int m = sc.nextInt();
        System.out.print("Ingrese el valor de n (se recomienda n <= 6): ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("m y n deben ser enteros no negativos.");
        } else {
            System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
        }
        sc.close();
    }
}
