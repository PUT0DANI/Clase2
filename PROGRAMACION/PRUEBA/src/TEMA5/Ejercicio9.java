package TEMA5;

import java.util.Random;

public class Ejercicio9 {
    static void main() {
        Random r = new Random();
        int[] numeros = new int[10];
        boolean repetido = false;
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = r.nextInt(-10,10);
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("Repetidos");
        for (int i = 0; i < numeros.length; i++) {
            // Aqui compruebo si se reptire
            for (int j = 0; j < i; j++){
                if ( numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }

            if(!repetido){
                for(int j = i+1; j < numeros.length; j++){
                    if (numeros[i] == numeros[j]){
                        System.out.print(numeros[i] + " ");
                        break;
                    }
                }
            }
        }

    }
}
