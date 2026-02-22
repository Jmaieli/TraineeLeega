package Exercicio3;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo, double nConta) {

        super(saldo, nConta);
    }

    @Override
    public void aplicarJuros() {
        saldo += saldo * 0.15;
    }

}
