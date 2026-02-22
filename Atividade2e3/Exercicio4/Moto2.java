package Exercicio4;

import Exercicio1.Moto;

public class Moto2 extends Moto {

    public Moto2(String modelo, int ano, String cor, String tipoFreio, double velocidade) {
        super(modelo, ano, cor, tipoFreio, velocidade);
    }
    
    @Override
    public void imprimirInformacoes() {
        // imprimir as props especificas de Carro
        System.out.println("testMotoca");
    }
}
