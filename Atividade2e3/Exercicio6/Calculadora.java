package Exercicio6;

public class Calculadora {

    // -------- SOMA --------
    // public int soma(int a, int b) {
    //     return a + b;
    // }

    // public double soma(double a, double b) {
    //     return a + b;
    // }

    // public int soma(int a, int b, int c) {
    //     return a + b + c;
    // }

    // // -------- SUBTRAÇÃO --------
    // public int subtrair(int a, int b) {
    //     return a - b;
    // }

    // public double subtrair(double a, double b) {
    //     return a - b;
    // }

    // // -------- MULTIPLICAÇÃO --------
    // public int multiplicar(int a, int b) {
    //     return a * b;
    // }

    // public double multiplicar(double a, double b) {
    //     return a * b;
    // }

    // // -------- DIVISÃO --------
    // public double dividir(int a, int b) {
    //     return (double) a / b;
    //     }

    // public double dividir(double a, double b) {
    //     return a / b;
    // }

    public double dividirComException(double numero1, double numero2) {
        
        if (numero2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }

        return numero1 / numero2;
    }
}