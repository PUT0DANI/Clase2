package Ejercicio1TEMA6;

import java.time.Period;
import java.util.ArrayList;

public class Personas {
     ArrayList<Persona> personas;


     // CONSTRUCTOR


    public Personas() {
        this.personas = new ArrayList<>();
    }

    public Personas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    // METODOS

    public void mostrarPersonas(){
        for (Persona persona : personas){
            System.out.print(persona + ", ");
        }
    }

    public int mediaEdad(){
        int media = 0;
        for (Persona persona : personas){
            media += persona.calcularEdad();

        }
        return media / personas.size();
    }

    public Persona masEdad(){
        Persona mayor = personas.getFirst();
        for (int i = 1; i < personas.size(); i++){

            if (personas.get(i).calcularEdad() > personas.get(i -1).calcularEdad()){
                mayor = personas.get(i);
            }


        }
        return mayor;
    }

    // GETTER AND SETTER



    public ArrayList<Persona> getPersonas() {
        return personas;
    }

}
