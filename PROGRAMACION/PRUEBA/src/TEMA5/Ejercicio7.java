package TEMA5;

import java.util.Random;

public class Ejercicio7 {
    static void main() {
        Random r = new Random();
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = r.nextInt(-10,10);
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for(int i : numeros){
            if (i < 0){
                i = i * -1;

            }
            System.out.print(i + " ");
        }
    }
}
