/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Excepción que se lanza cuando el saldo es insuficiente para realizar una operación.
 * @author poo03alu25
 */
public class SaldoInsuficienteException extends Exception {
    /**
     * Constructor por defecto de la excepción.
     */
    public SaldoInsuficienteException() {
    }

    /**
     * Constructor de la excepción con un mensaje específico.
     * @param message Mensaje de la excepción
     */
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
