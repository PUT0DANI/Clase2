package TEMA5;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().trim().toLowerCase();
        sc.close();

        String[] palabras = frase.split(" ");
        Arrays.sort(palabras);

        for (String p : palabras) {
            if (p.length() > 0) {
                System.out.println(terminaEnMayuscula(p));
            }
        }
    }

    static String terminaEnMayuscula(String palabra) {
        int ultima = palabra.length() - 1;
        return palabra.substring(0, ultima) + palabra.substring(ultima).toUpperCase();
    }
}
