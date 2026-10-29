package TEMA4;

import java.util.Scanner;

public class Ejercicio7 {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Dame tu nota: ");
        int nota = sc.nextInt();
        System.out.println("Has " + notas(nota));
    }
    static String notas(int nota){
        if (nota < 5 && nota >= 0){
            return "Suspenso";
        } else if (nota == 5 || nota == 6){
            return "Aprobado";
        } else if (nota == 7 || nota == 8){
            return "Notable";
        } else if (nota == 9 || nota == 10) {
            return "Sobresaliente";
        } else {
            return "No me has dado una nota valida";
        }
    }
}
