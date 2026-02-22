package Exercicio7Ativ3;

public class Conta {

    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException(
                "Saldo insuficiente! Saldo atual: R$ " + saldo
            );
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + saldo);
    }
}