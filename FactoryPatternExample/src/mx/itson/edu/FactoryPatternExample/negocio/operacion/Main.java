/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
// Main.java
public class Main {
    public static void main(String[] args) {
        VehiculoFactory factory = new VehiculoFactory();

        // Crear un coche
        Vehiculo coche = factory.crearVehiculo("Coche");
        coche.acelerar();
        coche.frenar();

        // Crear una moto
        Vehiculo moto = factory.crearVehiculo("Moto");
        moto.acelerar();
        moto.frenar();
    }
}