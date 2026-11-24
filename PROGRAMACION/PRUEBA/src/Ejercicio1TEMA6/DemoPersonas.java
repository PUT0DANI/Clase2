package Ejercicio1TEMA6;

import java.time.LocalDate;
import java.util.Scanner;

public class DemoPersonas {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Persona persona1 = new Persona("Daniel", "Remon", LocalDate.of(2006, 5, 2) , "18466912M", 'M');
        Persona persona2 = new Persona("Manolo", "Gutierrez", LocalDate.of(2000, 11, 6) , "18433526S", 'M');
        System.out.println(persona1);
        System.out.println(persona2);




    }
}
