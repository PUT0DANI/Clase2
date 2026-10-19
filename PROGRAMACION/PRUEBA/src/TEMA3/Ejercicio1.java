package TEMA3;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad en euros y te lo paso a pesetas: ");
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println(num + "€ son: " + num*166.386 + " pesetas.");
        } else {
            System.out.println("El valor introducido debe ser mayor a cero");
        }
    }
}
