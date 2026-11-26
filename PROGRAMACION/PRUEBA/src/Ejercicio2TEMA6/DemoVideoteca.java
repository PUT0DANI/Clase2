package Ejercicio2TEMA6;

import java.time.LocalDate;

public class DemoVideoteca {

    static void main() {
        Pelicula p1 = new Pelicula("Titanic", "Angel", LocalDate.of(1995,5,3), 144, "Amor", 10.0);
        Pelicula p2 = new Pelicula("Hobbit", "Pascual", LocalDate.of(2002,11,20), 124, "Aventura", 9.0);
        Pelicula p3 = new Pelicula("DAM", "Juanma", LocalDate.of(2004,1,17), 108, "Accion", 7.0);
        Pelicula p4 = new Pelicula("SI", "Loli", LocalDate.of(2006,8,9), 96, "Emocion", 8.2);
        Pelicula p5 = new Pelicula("PASCU", "Alberto", LocalDate.of(2010,7,27), 182, "Accion", 5.5);

        Videoteca v1 = new Videoteca();

        v1.getVideoteca().add(p1);
        v1.getVideoteca().add(p5);
        v1.getVideoteca().add(p3);
        v1.getVideoteca().add(p4);
        v1.getVideoteca().add(p5);

        System.out.println("Se muestran las peliculas");
        v1.mostrarVideoteca();
        System.out.println();

        System.out.println("La duración de las peliculas: "+ v1.mediaDuracion());
        System.out.println();

        System.out.println();


        System.out.println();

        v1.aniadirPelicula(new Pelicula("PASCUAAAl") );

        v1.mostrarVideoteca();




    }


}
