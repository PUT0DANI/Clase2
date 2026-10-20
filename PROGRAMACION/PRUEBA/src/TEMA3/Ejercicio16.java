package TEMA3;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do {
            System.out.print("Dime la cantidad en pesetas y te lo paso a euros, con 0 termino: ");
            double pese = sc.nextDouble();
            if (pese == 0){
                salir = true;
            } else {
                if (pese < 0){
                    System.out.println("No puedes introducir un numero negativo.");
                } else {
                    System.out.println(pese + " pesetas son: " + pese/166.386 + " euros.");

                }
            }


        } while (!salir);

    }
}
