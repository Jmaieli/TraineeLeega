package Exercicio4;

import Exercicio1.Carro;

public class Carro2 extends Carro {

    public Carro2(String modelo, int ano, String cor, String combustivel, String portaMalas) {
        super(modelo, ano, cor, combustivel, portaMalas);
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("test");
    }
}
