/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.factoryFigurasGeometricas.entidades;

import mx.itson.edu.factoryFigurasGeometricas.interfaces.Personaje;

/**
 * Clase que representa un personaje de tipo Mago.
 * Implementa la interfaz Personaje para definir sus acciones mágicas.
 * @author Lenovo.
 */
public class Mago implements Personaje {

    /**
     * Realiza la acción de atacar, mostrando un mensaje indicando el lanzamiento de un hechizo.
     */
    public void atacar() {
        System.out.println("El mago lanza un hechizo.");
    }

    /**
     * Realiza la acción de moverse, mostrando un mensaje indicando el uso de teletransportación.
     */
    public void mover() {
        System.out.println("El mago se teletransporta.");
    }
}
