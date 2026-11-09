package TEMA3;

import java.util.Scanner;

public class Ejercicio32 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero entero: ");
        int num = sc.nextInt();
        for ( int i = 2; i < num; i++){
            if ( num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
