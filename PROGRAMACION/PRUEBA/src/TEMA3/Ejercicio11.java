package TEMA3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dame el primer numero: ");
        int num2 = sc.nextInt();
        int resto = num1;
        int resultado = 0;
        do {
            System.out.print(resto+ " - " + num2 + " = " + (resto - num2) + " --> ");
            resto = resto - num2;

             resultado++;
        } while(resto >= num2);
        System.out.println(resultado);
    }
}
