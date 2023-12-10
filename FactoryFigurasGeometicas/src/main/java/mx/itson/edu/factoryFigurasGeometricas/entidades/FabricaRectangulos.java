/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.factoryFigurasGeometricas.entidades;

import mx.itson.edu.factoryFigurasGeometricas.interfaces.FabricaFormas;
import mx.itson.edu.factoryFigurasGeometricas.interfaces.FormaGeometrica;

/**
 *
 * @author Lenovo.
 */
public class FabricaRectangulos implements FabricaFormas {

    public FormaGeometrica crearForma() {

        return new Rectangulo();

    }

}
