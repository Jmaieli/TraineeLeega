
package Exercicio3;

public abstract class ContaBancaria {
    protected double saldo;
    private double nConta;

    public ContaBancaria(double saldo, double nConta){

        this.saldo = saldo;
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public double getnConta() {
        return nConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract void aplicarJuros();
}
