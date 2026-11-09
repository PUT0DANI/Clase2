package TEMA4;

import java.util.Scanner;

public class Ejercicio11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero y te calculo la factorial: ");
        int num = sc.nextInt();
        System.out.println(factorial(num));

    }
    static int factorial(int num){

        if (num <= 1){

            return 1;
        } else {

            return num *  factorial(num-1);

        }
    }
}
