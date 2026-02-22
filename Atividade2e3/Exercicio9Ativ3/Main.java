package Exercicio9Ativ3;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Ana", 500);
        ContaBancaria conta2 = new ContaBancaria("Carlos", 300);

        try {
            conta1.transferir(conta2, -100); // test
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}