package TEMA3;

import java.util.Scanner;

public class Ejercicio30 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame la altura del triangulo: ");
        int altura = sc.nextInt();
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
