/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.figurasPrototype.main;
import mx.itson.figurasPrototype.entidades.Persona;

/**
 *
 * @author Lenovo.
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona personaOriginal = new Persona("Juan");
        Persona copiaPersona = (Persona) personaOriginal.clonar();
        System.out.println(personaOriginal);
        System.out.println(copiaPersona);
    }
}
