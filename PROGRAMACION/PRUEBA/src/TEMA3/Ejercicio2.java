package TEMA3;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el dia de la semana y te digo la extraescolar: ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Lunes - Musica");
                break;
            case 2:
                System.out.println("Martes - Natacion");
                break;
            case 3:
                System.out.println("Miercoles - Ingles");
                break;
            case 4:
                System.out.println("Jueves - Natacion");
                break;
            case 5:
                System.out.println("No tienes ninguna extraescolar!");
                break;
            case 6:
                System.out.println("Sabado - Deporte escolar");
                break;
            case 7:
                System.out.println("No tienes ninguna extraescolar!");
                break;
            default:
                System.out.println("Valor erroneo");
                break;
        }
    }
}
