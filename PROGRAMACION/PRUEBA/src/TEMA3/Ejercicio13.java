package TEMA3;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero entero de varias cifras: ");
        int num = sc.nextInt();
        int con = 0;
        do {
            num = num / 10;
            con++;
        } while (num >= 1);
        System.out.println("Tiene " + con + " cifras.");
    }
}
