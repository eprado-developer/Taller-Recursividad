package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 3: Calcular la sumatoria 1 + 1/2 + 1/3 + ... + 1/n.
 */
public class Ejercicio03_SumatoriaFracciones {

    public static double sumatoria(int n) {
        if (n == 1) return 1.0;
        return (1.0 / n) + sumatoria(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("n debe ser mayor o igual a 1.");
        } else {
            System.out.printf("Sumatoria 1 + 1/2 + ... + 1/%d = %.6f%n", n, sumatoria(n));
        }
        sc.close();
    }
}
