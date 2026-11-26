package Ejercicio2TEMA6;

import java.util.ArrayList;
import java.util.Scanner;

public class Videoteca {
    private final ArrayList<Pelicula> videoteca;


    //  METODOS

    public void mostrarVideoteca(){
        for (Pelicula pelicula : videoteca){
            System.out.println(pelicula + ", ");
        }
    }

    public int mediaDuracion(){
        int suma = 0;
       for (Pelicula pelicula : videoteca){
           suma += pelicula.duracionMinutos;
       }
       return suma / videoteca.size();
    }

    public Pelicula masAntigua(){
        Pelicula mayor = videoteca.getFirst();
        for (Pelicula p : videoteca){
            if (p.getFechaEstreno().isBefore(mayor.getFechaEstreno())){
                mayor = p;
            }

        }
        return mayor;
    }
    public void buscarPeliculas(String texto){
        boolean encontrado = false;

        for ( Pelicula p : videoteca){
            if(p.getTitulo().equalsIgnoreCase(texto) ||
                    p.getDirector().equalsIgnoreCase(texto) ||
                    p.getGenero().equalsIgnoreCase(texto)){
                encontrado = true;
                System.out.println(p);
            }
        }
        if(!encontrado) {
            System.out.println("No esta");
        }

    }
    public void aniadirPelicula(Pelicula p){
        videoteca.add(p);
    }
    //  CONSTRUCTORES

    public Videoteca() {
        this.videoteca = new ArrayList<>() ;
    }

    public Videoteca(ArrayList<Pelicula> videoteca) {
        this.videoteca = videoteca;
    }

    //  GETTER AND SETTER


    public ArrayList<Pelicula> getVideoteca() {
        return videoteca;
    }
}
