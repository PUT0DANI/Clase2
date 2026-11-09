package TEMA3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio31 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a;
        int mayor = 0;
        int menor = 100;
        for (int i = 0; i < 10; i++){
            a = r.nextInt(100);
            System.out.print(a + ", ");

            if ( i == 0){
                mayor = a;
            }
            if ( a > mayor) {
                mayor = a;
            }
            if ( a < menor){
                menor = a;
            }

        }
        System.out.println();
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
