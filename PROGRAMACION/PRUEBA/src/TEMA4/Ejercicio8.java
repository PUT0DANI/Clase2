package TEMA4;

import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        int num2 = sc.nextInt();
        if (mayor(num1,num2) == 0) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El mayor es: " + mayor(num1,num2));

        }
    }
    static int mayor(int num1, int num2){
        if (num1 > num2){
            return num1;
        } else if(num2 > num1) {
            return num2;
        } else {
            return 0;
        }
    }
}
