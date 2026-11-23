package TEMA6.LIBRERIA;

import java.util.Scanner;

public class MAIN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Libro l1 = new Libro();
        System.out.println(l1);

        Libro l2 = new Libro("Lovcraft", "9032-2312-DWDS", "Las montañas del silencio", "Terror", 350);
        System.out.println(l2);
        l2.setTitulo("Las montañas ocultas");
        System.out.println(l2);
        System.out.println(l2.getAutor());

        System.out.println("Dime la tematica: ");
        l2.setTematica(sc.nextLine());
        System.out.println(l2);

        Estanteria e1 = new Estanteria();
    }
}
