package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 13: Serie de Fibonacci hasta un límite dado.
 * Fib(0) = 0
 * Fib(1) = 1
 * Fib(n) = Fib(n-1) + Fib(n-2), si n >= 2
 */
public class Ejercicio13_Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el límite de la serie de Fibonacci: ");
        int limite = sc.nextInt();

        System.out.print("Serie de Fibonacci hasta " + limite + ": ");
        int i = 0;
        while (true) {
            int valor = fibonacci(i);
            if (valor > limite) break;
            System.out.print(valor + " ");
            i++;
        }
        System.out.println();
        sc.close();
    }
}
