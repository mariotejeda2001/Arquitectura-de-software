/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.factoryFigurasGeometricas.entidades;

import mx.itson.edu.factoryFigurasGeometricas.interfaces.FabricaPersonajes;
import mx.itson.edu.factoryFigurasGeometricas.interfaces.Personaje;

/**
 * Fábrica encargada de crear instancias de magos.
 * Implementa la interfaz FabricaPersonajes.
 * author por Lenovo.
 */
public class FabricaMagos implements FabricaPersonajes {

    /**
     * Crea y devuelve una instancia de mago.
     *
     * @return Una nueva instancia de Mago, que representa un personaje mago.
     */
    public Personaje crearPersonaje() {
        return new Mago();
    }
}
