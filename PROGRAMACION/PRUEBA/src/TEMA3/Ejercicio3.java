package TEMA3;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una letra: ");
        if (sc.hasNextLine()) {


            System.out.println("Se trata de una caracter alfabetico");
        } else if (sc.hasNextInt()) {
            System.out.println("Es numero");
        } else {
            System.out.println("Es otro caracter");
        }

    }
}
