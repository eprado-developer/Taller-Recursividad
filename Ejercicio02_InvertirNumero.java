package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 2: Leer un número entero e invertirlo.
 * Ejemplo: Entrada: 123 → Salida: 321
 */
public class Ejercicio02_InvertirNumero {

    public static void invertir(int n) {
        if (n == 0) return;
        System.out.print(n % 10);
        invertir(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        System.out.print("Número invertido: ");
        if (n < 0) {
            System.out.print("-");
            n = -n;
        }
        invertir(n);
        System.out.println();
        sc.close();
    }
}
