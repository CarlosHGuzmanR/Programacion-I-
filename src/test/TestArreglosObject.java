package test;

import domain.Persona;

public class TestArreglosObject {
    static public void main(String[] args){
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Jna");
        personas[1] = new Persona("karlA");
        
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + "= " + personas[i]);
        }
        
        //Inicializar los valores desde la definicion
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + "= " + frutas[i]);
        }
    }
}
