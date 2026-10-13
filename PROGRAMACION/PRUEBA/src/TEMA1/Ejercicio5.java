package TEMA1;

public class Ejercicio5 {
    static void main() {
        int a = 4;
        int b = 7;
        System.out.println("a vale: " + a + " y b vale: " + b);
        System.out.println("-- Intercambiamos --");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("Ahora a vale: " + a + " y b vale: " + b );

    }
}
