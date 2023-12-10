/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pizzaBuilder.entidades;

/**
 *
 * @Carlos Lenovo.
 */
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }   
    
    /**
     * @return the dough
     */
    public String getDough() {
        return dough;
    }

    /**
     * @param dough the dough to set
     */
    public void setDough(String dough) {
        this.dough = dough;
    }

    /**
     * @return the sauce
     */
    public String getSauce() {
        return sauce;
    }

    /**
     * @param sauce the sauce to set
     */
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    /**
     * @return the topping
     */
    public String getTopping() {
        return topping;
    }

    /**
     * @param topping the topping to set
     */
    public void setTopping(String topping) {
        this.topping = topping;
    }
}
