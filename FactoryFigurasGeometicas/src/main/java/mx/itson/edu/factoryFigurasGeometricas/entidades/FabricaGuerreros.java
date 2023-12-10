/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.factoryFigurasGeometricas.entidades;

import mx.itson.edu.factoryFigurasGeometricas.interfaces.FabricaPersonajes;
import mx.itson.edu.factoryFigurasGeometricas.interfaces.Personaje;

/**
 * Fábrica encargada de crear instancias de guerreros.
 * Implementa la interfaz FabricaPersonajes.
 * @author Lenovo.
 */
public class FabricaGuerreros implements FabricaPersonajes {

    /**
     * Crea y devuelve una instancia de guerrero.
     *
     * @return Una nueva instancia de Guerrero, que representa un personaje guerrero.
     */
    public Personaje crearPersonaje() {
        return new Guerrero();
    }
}
