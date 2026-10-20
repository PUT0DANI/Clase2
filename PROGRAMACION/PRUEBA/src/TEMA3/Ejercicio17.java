package TEMA3;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int cont = 0;
        double mayor = 0;
        double menor = 0;
        int mesMayor = 0;
        int mesMenor = 0;
        for (int i = 1; i<=12; i++){
            System.out.println("Dame la facturacion del mes " + i + ": ");
            double fact = sc.nextDouble();
            if (i == 1) {
                menor = fact;
            }
            if (i > mayor) {
                mayor = fact;
                mesMayor = i;
            }


            if (i < menor) {
                menor = fact;
                mesMenor = i;
            }
            total = total + fact;
            cont++;
        }
        System.out.print("El total es: " + total + " y la media es: " + total/cont);
        System.out.println("El mes con mas facturacion es: " + mesMayor + " con " + mayor);
        System.out.println("El mes con menos facturacion es: " + mesMenor + " con " + menor);

    }
}
