package TEMA5;

import java.util.Random;

public class Ejercicio8 {
    static void main() {
        Random r = new Random();
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];
        // rellenar
        System.out.println("Array1");
        for(int i = 0; i < numeros1.length; i++){
            numeros1[i] = r.nextInt(-10,10);
            System.out.print(numeros1[i] + " ");
        }

        System.out.println();
        System.out.println("Array2");
        for(int i = 0; i < numeros2.length; i++){
            numeros2[i] = r.nextInt(-10,10);
            System.out.print(numeros2[i] + " ");

        }
        System.out.println();
        System.out.println("Suma de los dos");
        int[] suma = new int[10];
        for (int i = 0; i < suma.length; i++){
            suma[i] = numeros1[i] + numeros2[i];
            System.out.print(suma[i] + " ");
        }


    }
}
