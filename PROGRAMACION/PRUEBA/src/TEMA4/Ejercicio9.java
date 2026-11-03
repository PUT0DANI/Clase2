package TEMA4;

import java.util.Scanner;

public class Ejercicio9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        recursivo(num);
    }
    static int recursivo(int num){
        if(num <= 0 ) {
            System.out.println("Tiene que ser un numero mayor a 0");
            return 0;
        } else {
            System.out.println(num);
            return recursivo(num-1);
        }

    }
}
