package Exercicio7Ativ3;

public class Main {

    public static void main(String[] args) {

        Conta conta = new Conta(100);

        try {
            conta.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}