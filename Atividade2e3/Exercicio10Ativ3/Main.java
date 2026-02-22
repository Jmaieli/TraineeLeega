package Exercicio10Ativ3;

public class Main {

    public static void main(String[] args) {

        DivisaoInteira divisao = new DivisaoInteira();

        try {
            int resultado = divisao.dividir(10, 3);
            System.out.println("Resultado: " + resultado);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}