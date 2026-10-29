package TEMA4;

import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame una letra: ");
        String letra = sc.next();
        System.out.print("Dame la altura del triangulo: ");
        int num = sc.nextInt();
        triangulo(letra,num);
    }
    static void triangulo(String letra, int num){
        int base = num;
        for (int i = 0; i <= num; i++){
            for (int j = 0; j < base;j++){
                System.out.print(letra);
            }
            System.out.println();
            base--;
        }
    }
}
