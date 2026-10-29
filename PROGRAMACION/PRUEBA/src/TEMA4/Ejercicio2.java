package TEMA4;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("El menor es: " + menor(num1,num2));
    }
    static int menor(int num1, int num2){

        if (num2 < num1){
            return num2;
        } else {
            return num1;
        }
    }
}
