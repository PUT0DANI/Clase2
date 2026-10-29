package TEMA4;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero y te cambio el signo: ");
        int num = sc.nextInt();
        System.out.println("El numero final es: " + signo(num));
    }
    static int signo(int num){
        if (num == 0 ) {
            return 0;
        } else {
            return -num;
        }

    };

}
