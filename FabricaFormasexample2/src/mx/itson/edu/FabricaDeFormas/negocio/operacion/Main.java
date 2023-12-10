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
// Main.java
public class Main {
    public static void main(String[] args) {
        FabricaFormas fabrica = new FabricaFormas();

        // Crear un círculo
        Forma circulo = fabrica.crearForma("Circulo");
        circulo.dibujar();

        // Crear un cuadrado
        Forma cuadrado = fabrica.crearForma("Cuadrado");
        cuadrado.dibujar();
    }
}

