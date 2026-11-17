import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean menor = false;
        int ultimo = 0;
        int penultimo = 0;
        do {
            System.out.print("Dame un numero, parare cuando el numero sea menor a la suma de los anteriores: ");
            int numero = sc.nextInt();
            if (numero < (ultimo + penultimo)){
                menor = true;
                System.out.println("El numero introducido es menor. Parando...");
            }

            penultimo = ultimo;
            ultimo = numero;

        } while (!menor);
    }
}
