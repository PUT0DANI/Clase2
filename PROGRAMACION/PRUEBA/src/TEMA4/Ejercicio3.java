package TEMA4;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dame la potencia: ");
        int pot = sc.nextInt();
        potencia(num1,pot);
    }
    static void potencia(int num1, int pot){
        int resultado = num1;
        for(int i = 0; i < pot -1; i++){
            resultado = resultado * num1;
        }
        System.out.println("El resultado de la potencia es: " + resultado);
    }
}
