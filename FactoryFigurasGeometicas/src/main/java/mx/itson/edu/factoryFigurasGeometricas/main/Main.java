/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.edu.factoryFigurasGeometricas.main;

import mx.itson.edu.factoryFigurasGeometricas.entidades.FabricaCirculos;
import mx.itson.edu.factoryFigurasGeometricas.entidades.FabricaGuerreros;
import mx.itson.edu.factoryFigurasGeometricas.entidades.FabricaMagos;
import mx.itson.edu.factoryFigurasGeometricas.entidades.FabricaRectangulos;
import mx.itson.edu.factoryFigurasGeometricas.interfaces.FabricaFormas;
import mx.itson.edu.factoryFigurasGeometricas.interfaces.FabricaPersonajes;
import mx.itson.edu.factoryFigurasGeometricas.interfaces.FormaGeometrica;
import mx.itson.edu.factoryFigurasGeometricas.interfaces.Personaje;

/**
 * Clase principal que demuestra la creación y uso de fábricas para formas geométricas y personajes.
 * @author Lenovo.
 */
public class Main {

    public static void main(String[] args) {

        // Fábrica de círculos
        FabricaFormas fabrica = new FabricaCirculos();
        FormaGeometrica forma = fabrica.crearForma();
        forma.dibujar();

        // Fábrica de rectángulos
        fabrica = new FabricaRectangulos();
        forma = fabrica.crearForma();
        forma.dibujar();

        // Fábrica de guerreros
        FabricaPersonajes fabricaPersonaje = new FabricaGuerreros();
        Personaje personaje = fabricaPersonaje.crearPersonaje();
        personaje.atacar();

        // Fábrica de magos
        fabricaPersonaje = new FabricaMagos();
        personaje = fabricaPersonaje.crearPersonaje();
        personaje.mover();
    }
}