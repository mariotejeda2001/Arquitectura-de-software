/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pizzaBuilder.entidades;

/**
 *
 * @author Lenovo.
 */
public class PizzaBuilder {
    private String dough;
    private String sauce;
    private String topping;

    public PizzaBuilder addIngrediente(String dough) {
        this.dough = dough;
        return this;
    }
    
    public PizzaBuilder addSalsa(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder addSabor(String topping) {
        this.topping = topping;
        return this;
    }

    public Pizza build() {
        return new Pizza(dough, sauce, topping);
    }
}
