package Exercicio3Ativ3;

public class Main {
    public static void main(String[] args) {

        Idade idade = new Idade();

        try {
            idade.verificarIdade(200); // teste
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}