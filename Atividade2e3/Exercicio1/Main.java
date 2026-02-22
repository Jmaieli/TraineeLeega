package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(" Volkwagen", 1950, " Azul", " Gasolina", " sim");

        Moto moto = new Moto(" hornet", 2025, " preta", " ABS" ,180);

        System.out.println("Carro: ");
        System.out.println("cor:         "+ carro.getCor());
        System.out.println("combustivel: "+ carro.getCombustivel());
        System.out.println("porta malas: "+ carro.getPortaMalas());
        carro.AbrirPortaMalas();
        System.out.println();

        System.out.println("Moto: ");
        System.out.println("cor:           "+ moto.getCor());
        System.out.println("tipo de freio: "+ moto.getTipoFreio());
        System.out.println("Velocidade:    "+ moto.getVelocidade());
        moto.frear();
    }

}
