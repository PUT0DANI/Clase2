package TEMA4;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("La media es: " + media(num1,num2));
    }
    static double media(int num1, int num2){
        return (double) (num1 + num2) /2;
    }
}
