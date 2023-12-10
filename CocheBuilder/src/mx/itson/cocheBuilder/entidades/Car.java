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
public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private int horsePower;

    public Car(String make, String model, int year, String color, int horsePower) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.horsePower = horsePower;
    }
    
    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the horsePower
     */
    public int getHorsePower() {
        return horsePower;
    }

    /**
     * @param horsePower the horsePower to set
     */
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
