package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 4: Sumar los dígitos de un número.
 * Ejemplo: Entrada: 123 → Resultado: 6
 */
public class Ejercicio04_SumaDigitos {

    public static int sumaDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumaDigitos(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        if (n < 0) n = -n; // manejar negativos
        System.out.println("Suma de los dígitos de " + n + " = " + sumaDigitos(n));
        sc.close();
    }
}
