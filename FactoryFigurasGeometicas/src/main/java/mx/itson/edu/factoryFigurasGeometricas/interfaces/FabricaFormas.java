/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.itson.edu.factoryFigurasGeometricas.interfaces;

/**
 * Interfaz que define el contrato para las fábricas de formas geométricas.
 * @author Lenovo.
 */
public interface FabricaFormas {

    /**
     * Crea y devuelve una forma geométrica.
     *
     * @return Una instancia de FormaGeometrica, que representa una forma geométrica.
     */
    FormaGeometrica crearForma();
}
