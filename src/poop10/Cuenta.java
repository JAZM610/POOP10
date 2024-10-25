/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Representa una cuenta bancaria con operaciones básicas.
 * @author poo03alu25
 */
public class Cuenta {
    // Saldo de la cuenta
    double saldo;

    /**
     * Constructor por defecto de la clase Cuenta.
     */
    public Cuenta() {
    }

    /**
     * Constructor con saldo inicial de la clase Cuenta.
     * @param saldo Saldo inicial de la cuenta
     */
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * @param saldo Nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Deposita un monto en la cuenta.
     * @param monto Monto a depositar
     */
    public void depositar(double monto) {
        saldo += monto;
    }

    /**
     * Retira un monto de la cuenta, lanzando una excepción si el saldo es insuficiente.
     * @param monto Monto a retirar
     * @throws SaldoInsuficienteException Si el saldo es insuficiente
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("No tienes ese dinero");
        } else {
            saldo -= monto;
        }
    }

    /**
     * Consulta el saldo actual de la cuenta.
     * @return Saldo actual
     */
    public double consultarSaldo() {
        return getSaldo();
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}
