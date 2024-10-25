/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Clase principal del programa POOP10.
 * @author poo03alu25
 */
public class POOP10 {

    /**
     * Método principal que ejecuta el programa.
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Mensaje de saludo
        System.out.println("Hola mundo");
        
        // Ejemplo de operación aritmética
        int a = 5;
        float c = (float) a / 2;
        System.out.println(c);

        // Ejemplo de arreglo
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = i * 10;
        }

        // Manejo de excepción ArrayIndexOutOfBoundsException
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(b[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepción de desbordamiento de memoria");
        }
        System.out.println("Hola he sobrevivido");

        // Manejo de excepción ArithmeticException
        try {
            float d = 4 / 0;
            System.out.println(d);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepción de desbordamiento de memoria");
        } catch (ArithmeticException ex) {
            System.out.println("Excepción aritmética permeada");
        }

        // Ejemplo de llamada a método
        float n = miMetodoDivision(100, 2);
        System.out.println(n);

        // Manejo de excepción ArithmeticException en método
        try {
            float m = miMetodoDivision(100, 0);
            System.out.println(m);
        } catch (ArithmeticException ex) {
            System.out.println("Excepción aritmética segundo catch");
            ex.printStackTrace(); // O imprime el stack trace
        }

        System.out.println("A pesar de todo seguimos en el programa");

        float x = miMetodoDivision(20, 5);
        System.out.println(x);

        // Manejo de excepción UnsupportedOperationException
        try {
            int w = suma(1, 2);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Excepción de operación no soportada");
            System.out.println("Atributo mensaje:");
            System.out.println(ex.getMessage());
        }

        System.out.println("#############################");

        // Uso de la clase Cuenta
        Cuenta cuenta = new Cuenta(100.0f);
        System.out.println(cuenta.consultarSaldo());
        cuenta.depositar(100);
        System.out.println(cuenta.consultarSaldo());
        try {
            cuenta.retirar(300);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Excepción lanzada");
        }
        System.out.println(cuenta.consultarSaldo());
    }

    /**
     * Método que realiza una división.
     * @param f Dividendo
     * @param f0 Divisor
     * @return Resultado de la división
     * @throws ArithmeticException Si el divisor es cero
     */
    private static float miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f / f0;
    }

    /**
     * Método que lanza una excepción de operación no soportada.
     * @param i Primer entero
     * @param i0 Segundo entero
     * @return Nada, lanza excepción
     */
    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Operación no soportada aún"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
