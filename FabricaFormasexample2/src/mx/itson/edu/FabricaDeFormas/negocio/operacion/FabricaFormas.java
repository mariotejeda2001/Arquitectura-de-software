/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.edu.FabricaDeFormas.negocio.operacion;

/**
 *
 * @author Lenovo
 */
// FabricaFormas.java
public class FabricaFormas {
    public Forma crearForma(String tipo) {
        if ("Circulo".equalsIgnoreCase(tipo)) {
            return new Circulo();
        } else if ("Cuadrado".equalsIgnoreCase(tipo)) {
            return new Cuadrado();
        } else {
            throw new IllegalArgumentException("Tipo de forma no válido");
        }
    }
}
