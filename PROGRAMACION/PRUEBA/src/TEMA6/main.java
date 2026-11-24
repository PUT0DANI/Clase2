package TEMA6;


import java.util.Scanner;

public class main  {
    static void main() {
        Scanner sc = new Scanner(System.in);
        libro l1 = new libro();
        System.out.println(l1);

        libro l2 = new libro("Lovcraft", "9032-2312-DWDS", "Las montañas del silencio", "Terror", 350);
        System.out.println(l2);
        l2.setTitulo("Las montañas ocultas");
        System.out.println(l2);
        System.out.println(l2.getAutor());

        System.out.println("Dime la tematica: ");
        l2.setTematica(sc.nextLine());
        System.out.println(l2);

        estanteria e1 = new estanteria();
    }
}
