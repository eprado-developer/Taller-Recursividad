package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 6: Calcular la potencia base^exponente usando recursividad.
 */
public class Ejercicio06_Potencia {

    public static double potencia(double base, int exponente) {
        if (exponente == 0) return 1;
        if (exponente < 0) return 1.0 / potencia(base, -exponente);
        return base * potencia(base, exponente - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        System.out.printf("%.2f ^ %d = %.6f%n", base, exponente, potencia(base, exponente));
        sc.close();
    }
}
