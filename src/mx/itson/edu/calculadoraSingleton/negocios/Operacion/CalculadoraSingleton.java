/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class CalculadoraSingleton {

    // Instancia única de la calculadora
    private static CalculadoraSingleton instancia;

    // Constructor privado para evitar la creación de instancias directas
    private CalculadoraSingleton() {
    }

    // Método para obtener la única instancia de la calculadora
    public static CalculadoraSingleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new CalculadoraSingleton();
        }
        return instancia;
    }

    // Métodos de la calculadora
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No es posible dividir por cero");
        }
        return (double) a / b;
    }
}
