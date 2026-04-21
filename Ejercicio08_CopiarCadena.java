package Recursividad;

import java.util.Scanner;

/**
 * Ejercicio 8: Copiar una cadena en otra usando recursividad.
 */
public class Ejercicio08_CopiarCadena {

    public static String copiarCadena(String origen, int indice) {
        if (indice == origen.length()) return "";
        return origen.charAt(indice) + copiarCadena(origen, indice + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String original = sc.nextLine();
        String copia = copiarCadena(original, 0);
        System.out.println("Cadena original : " + original);
        System.out.println("Cadena copiada  : " + copia);
        sc.close();
    }
}
