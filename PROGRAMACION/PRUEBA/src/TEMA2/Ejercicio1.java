package TEMA2;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el lado1: ");
        int lado1 = sc.nextInt();
        System.out.println("Dime el lado2: ");
        int lado2 = sc.nextInt();

        System.out.println("El lado del rectangulo es: " + (lado1 * lado2));
    }
}
