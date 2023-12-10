/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.factoryFigurasGeometricas.entidades;

import mx.itson.edu.factoryFigurasGeometricas.interfaces.Personaje;

/**
 * Clase que representa un personaje tipo Guerrero.
 * Implementa la interfaz Personaje para definir sus acciones.
 * @author Lenovo.
 */
public class Guerrero implements Personaje {

    /**
     * Realiza la acción de atacar, mostrando un mensaje indicando el ataque con la espada.
     */
    public void atacar() {
        System.out.println("El guerrero ataca con su espada.");
    }

    /**
     * Realiza la acción de moverse, mostrando un mensaje indicando el desplazamiento a pie.
     */
    public void mover() {
        System.out.println("El guerrero se mueve a pie.");
    }
}
