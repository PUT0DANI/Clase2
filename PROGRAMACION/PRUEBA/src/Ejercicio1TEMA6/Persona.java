package Ejercicio1TEMA6;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    String nombre;
    String apellidos;
    LocalDate fech_nac;
    String DNI;
    char sexo;

    // CONSTRUCTORES

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, LocalDate fech_nac) {
        this.nombre = nombre;
        this.fech_nac = fech_nac;
    }

    public Persona(String nombre, String apellidos, LocalDate fech_nac, String DNI, char sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fech_nac = fech_nac;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    // METODOS

    public String Saludar(){
        return "Hola soy " + getNombre();
    }

    public int calcularEdad(){
        return Period.between(this.fech_nac, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Soy " + nombre + " " + apellidos + " con fecha de nacimiento: " + fech_nac +
                ", y DNI: " + DNI +
                ", sexo:" + sexo ;
    }


    // GETTER  AND  SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFech_nac() {
        return fech_nac;
    }

    public void setFech_nac(LocalDate fech_nac) {
        this.fech_nac = fech_nac;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
