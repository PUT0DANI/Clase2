package TEMA3;

import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dame el primer numero: ");
        int num2 = sc.nextInt();
        int resultado = num1;
        for (int i = 1; i <= num2; i++){
            resultado = resultado + num1;
        }
    }
}
