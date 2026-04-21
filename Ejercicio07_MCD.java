package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 7: Calcular el Máximo Común Divisor (MCD) usando el algoritmo de Euclides.
 * MCD(M, N) = M          si N = 0
 * MCD(M, N) = MCD(N, M % N) si N != 0
 */
public class Ejercicio07_MCD {

    public static int mcd(int m, int n) {
        if (n == 0) return m;
        return mcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero (M): ");
        int m = sc.nextInt();
        System.out.print("Ingrese el segundo número entero (N): ");
        int n = sc.nextInt();

        // Asegurar que M >= N para seguir la definición del enunciado
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        System.out.println("MCD(" + m + ", " + n + ") = " + mcd(m, n));
        sc.close();
    }
}
