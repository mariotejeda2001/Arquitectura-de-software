/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.itson.edu.factoryFigurasGeometricas.interfaces;

/**
 * Interfaz que define el contrato para las fábricas de personajes.
 * @author Lenovo.
 */
public interface FabricaPersonajes {

    /**
     * Crea y devuelve un personaje.
     *
     * @return Una instancia de Personaje, que representa un personaje del juego.
     */
    Personaje crearPersonaje();
}
