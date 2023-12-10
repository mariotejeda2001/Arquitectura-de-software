/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        // Obtén la instancia de la calculadora
        CalculadoraSingleton calculadora = CalculadoraSingleton.obtenerInstancia();

        // Realiza operaciones
        int resultadoSuma = calculadora.sumar(5, 3);
        int resultadoResta = calculadora.restar(8, 2);
        int resultadoMultiplicacion = calculadora.multiplicar(4, 6);
        double resultadoDivision = calculadora.dividir(9, 3);

        // Muestra resultados
        System.out.println("Suma: " + resultadoSuma);
        System.out.println("Resta: " + resultadoResta);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);
        System.out.println("División: " + resultadoDivision);
    }
}
