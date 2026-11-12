package TEMA5;

import java.util.Random;

public class Ejercicio6 {
    static void main() {
        Random r = new Random();
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = r.nextInt(-10,10);
            System.out.print(numeros[i] + " ");
        }

        int con = 0;
        for(int i : numeros){
            if (i < 0) {
                con++;
            }
        }
        System.out.println("La cantidad de negativos es: " + con);
    }
}
