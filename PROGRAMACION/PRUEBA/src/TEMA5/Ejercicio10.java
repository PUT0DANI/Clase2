package TEMA5;

import java.util.Random;

public class Ejercicio10 {
    static void main() {
        Random r = new Random();
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = r.nextInt(-10,10);
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("No Repetidos");

        for (int i = 0; i < numeros.length; i++) {
            boolean repetido = false;
            for(int j = 0; j < numeros.length; j++){
                if(i != j && numeros[i] == numeros[j]){
                    repetido=true;
                    break;
                }
            }
            if(!repetido){
                System.out.print(numeros[i] + " ");
            }

        }
    }
}
