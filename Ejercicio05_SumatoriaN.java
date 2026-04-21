package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 5: Calcular la sumatoria 1 + 2 + 3 + ... + n.
 */
public class Ejercicio05_SumatoriaN {

    public static int sumatoria(int n) {
        if (n == 0) return 0;
        return n + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo n: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("n debe ser un número no negativo.");
        } else {
            System.out.println("Sumatoria 1 + 2 + ... + " + n + " = " + sumatoria(n));
        }
        sc.close();
    }
}
