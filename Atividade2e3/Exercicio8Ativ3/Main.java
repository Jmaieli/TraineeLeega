package Exercicio8Ativ3;

public class Main {

    public static void main(String[] args) {

        ValidadorSenha validador = new ValidadorSenha();

        try {
            validador.validarSenha("12345"); //test
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}