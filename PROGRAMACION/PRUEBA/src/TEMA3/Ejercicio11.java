package TEMA3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dame el primer numero: ");
        int num2 = sc.nextInt();
        int resultado = num1;
        for (int i = 1; i < num2; i++){
            resultado = resultado - num2;

        }
    }
}
