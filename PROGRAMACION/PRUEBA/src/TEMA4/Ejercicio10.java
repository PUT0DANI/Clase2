package TEMA4;

import java.util.Scanner;

public class Ejercicio10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero y te calculo la factorial: ");
        int num = sc.nextInt();
        System.out.println(factorial(num));

    }
    static int factorial(int num){
        int resultado = 1;
        if (num <= 0) {
            System.out.println("Tiene que ser un numero mayor que 0.");
            return 0;
        } else {
            for(int i = num; i > 0; i--){
                resultado = resultado * i;
            }
            return resultado;
        }

    }
}
