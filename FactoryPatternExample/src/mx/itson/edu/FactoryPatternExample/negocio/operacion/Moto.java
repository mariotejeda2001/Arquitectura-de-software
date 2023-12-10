/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
// Moto.java
public class Moto implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Moto frenando");
    }
}