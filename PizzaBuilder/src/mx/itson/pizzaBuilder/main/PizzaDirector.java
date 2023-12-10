/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pizzaBuilder.main;
import mx.itson.pizzaBuilder.entidades.Pizza;
import mx.itson.pizzaBuilder.entidades.PizzaBuilder;

/**
 *
 * @author Lenovo.
 */
public class PizzaDirector {
    public Pizza crearPizzaPicante() {
        return new PizzaBuilder()
            .addIngrediente("Thin")
            .addSalsa("Spicy")
            .addSabor("Pepperoni")
            .build();
    }
}
