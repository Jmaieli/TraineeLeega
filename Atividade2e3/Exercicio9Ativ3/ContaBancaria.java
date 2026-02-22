package Exercicio9Ativ3;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void transferir(ContaBancaria destino, double valor)
            throws TransferenciaInvalidaException {

        if (valor <= 0) {
            throw new TransferenciaInvalidaException(
                "Transferência inválida! O valor deve ser maior que zero."
            );
        }

        if (valor > this.saldo) {
            throw new TransferenciaInvalidaException(
                "Transferência inválida! Saldo insuficiente."
            );
        }

        this.saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferência realizada com sucesso!");
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
    }
}