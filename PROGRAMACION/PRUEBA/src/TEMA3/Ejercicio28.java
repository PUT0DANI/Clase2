package TEMA3;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la altura del triangulo: ");
        int alt = sc.nextInt();
        int base = alt;
        for (int i = 0; i <= alt;i++){

            for (int j = 0; j < base;j++){
                System.out.print("*");
            }
            System.out.println();
            base--;
        }
    }
}
