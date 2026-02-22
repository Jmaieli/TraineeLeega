package Exercicio10;

public class Administrador implements Autenticavel {

    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    @Override
    public void autenticar() {
        System.out.println("Administrador " + nome + " autenticado com privilégios especiais.");
    }
}