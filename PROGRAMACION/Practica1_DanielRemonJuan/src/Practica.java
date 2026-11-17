import java.util.Scanner;

public class Practica {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean parar = false;
        int suma = 0;

        do{
            System.out.print("Dame un numero entero y paro cuando sea negativo: ");


            if (sc.hasNextInt()){
                int num = sc.nextInt();
                if (num < 0){
                    // Pongo break para que no sume la cifra del numero negativo
                    break;
                }
                do {
                    num = num / 10;
                    suma++;
                } while (num >= 1);

            } else {
                System.out.println("Debe introducir un numero entero.");
                parar = true;
            }

        }while (!parar);
        System.out.println("El total de cifras es: " + suma);
        System.out.println("Cerrando progama");

    }
}
