package Ejercicio2TEMA6;

import java.time.LocalDate;
import java.time.Period;

public class Pelicula {
    String titulo;
    String director;
    LocalDate fechaEstreno;
    int duracionMinutos;
    String genero;
    double calificacion;

    //  METODOS
    public String descripcion(){
        return "La pelicula " + titulo + ", dirigida por " + director + ", pertenece al genero " + genero + ".";
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo +
                ", director: " + director +
                ", fechaEstreno:" + fechaEstreno +
                ", duracionMinutos: " + duracionMinutos +
                ", genero: " + genero +
                ", calificacion: " + calificacion ;
    }

    public int calcularAnios(){
        return Period.between(fechaEstreno, LocalDate.now()).getYears();

    }
    //  CONSTRUCTORES

    public Pelicula() {
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public Pelicula(String titulo, String director, LocalDate fechaEstreno, int duracionMinutos, String genero, double calificacion) {
        this.titulo = titulo;
        this.director = director;
        this.fechaEstreno = fechaEstreno;
        this.duracionMinutos = duracionMinutos;
        this.genero = genero;
        this.calificacion = calificacion;
    }


    //  GETTER AND SETTER

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
