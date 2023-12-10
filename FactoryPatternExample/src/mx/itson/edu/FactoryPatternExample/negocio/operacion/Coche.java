/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
// Coche.java
public class Coche implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("Coche acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Coche frenando");
    }
}
