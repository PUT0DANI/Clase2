package TEMA4;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el numero y te doy la tabla de multiplicar: ");
        int num = sc.nextInt();
        Tabla(num);
    }
    static void Tabla(int num){

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
