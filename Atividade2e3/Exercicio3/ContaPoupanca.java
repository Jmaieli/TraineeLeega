package Exercicio3;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo, double nConta) {
        super(saldo, nConta);
    }

    @Override
    public void aplicarJuros() {
        saldo += saldo * 0.065;
    }
}