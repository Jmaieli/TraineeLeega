package Exercicio9;

import Exercicio3.ContaBancaria;
import Exercicio3.ContaCorrente;
import Exercicio3.ContaPoupanca;

public class Main {
public static void main(String[] args) {

        ContaBancaria conta1 = new ContaCorrente(1500, 1);
        ContaBancaria conta2 = new ContaPoupanca(1000, 2);

        conta1.aplicarJuros();
        conta2.aplicarJuros();

        System.out.println("Saldo Conta Corrente: " + conta1.getSaldo());
        System.out.println("Saldo Conta Poupança: " + conta2.getSaldo());
    }
}