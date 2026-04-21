package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 12: Crear una matriz de tamaño mxn y sumar sus elementos recursivamente.
 */
public class Ejercicio12_SumaMatriz {

    // Suma todos los elementos recorriendo fila por fila, columna por columna
    public static int sumaMatriz(int[][] matriz, int fila, int col) {
        int m = matriz.length;
        int n = matriz[0].length;

        if (fila == m) return 0; // Se agotaron las filas
        if (col == n) return sumaMatriz(matriz, fila + 1, 0); // Siguiente fila
        return matriz[fila][col] + sumaMatriz(matriz, fila, col + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("  matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int suma = sumaMatriz(matriz, 0, 0);
        System.out.println("Suma de todos los elementos de la matriz = " + suma);
        sc.close();
    }
}
