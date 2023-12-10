/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.factoryFigurasGeometricas.entidades;

import mx.itson.edu.factoryFigurasGeometricas.interfaces.FabricaFormas;
import mx.itson.edu.factoryFigurasGeometricas.interfaces.FormaGeometrica;

/**
 * Fábrica encargada de crear instancias de círculos.
 * Implementa la interfaz FabricaFormas.
 * @author Lenovo
 */
public class FabricaCirculos implements FabricaFormas {

    /**
     * Crea y devuelve una instancia de círculo.
     *
     * @return Una nueva instancia de Circulo, que representa un círculo.
     */
    public FormaGeometrica crearForma() {
        return new Circulo();
    }
}
