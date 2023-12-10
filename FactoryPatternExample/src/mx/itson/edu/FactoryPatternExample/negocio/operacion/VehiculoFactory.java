/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
// VehiculoFactory.java
public class VehiculoFactory {
    public Vehiculo crearVehiculo(String tipo) {
        if ("Coche".equalsIgnoreCase(tipo)) {
            return new Coche();
        } else if ("Moto".equalsIgnoreCase(tipo)) {
            return new Moto();
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }
}