/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.figurasPrototype.entidades;
import mx.itson.figurasPrototype.interfaces.Clonable;

/**
 *
 * @author Lenovo.
 */
public class Persona implements Clonable{
     private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public Clonable clonar() {
        return new Persona(this.nombre);
    }

    @Override
    public String toString() {
        return "Persona [Nombre: " + nombre + "]";
    }
}
