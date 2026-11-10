package TEMA5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        int[] array = new int[10];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        // Usando for each
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        do {
            System.out.print("Dime un numero y te lo busco(numero negativo para): ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Parando...");
                break;
            }
            boolean encontrado = false;
            for (int i : array){
                if(i==num){
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                System.out.println("Esta en el array");
            } else {
                System.out.println("No esta en el array");
            }
        } while (true);
    }
}
