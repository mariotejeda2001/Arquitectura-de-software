/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.cocheBuilder.entidades;

/**
 *
 * @author Lenovo.
 */
public class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String color;
    private int horsePower;

    public CarBuilder withMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder withYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder withHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }
    
    public Car build() {
     return new Car(make, model, year, color, horsePower);
    }
}
