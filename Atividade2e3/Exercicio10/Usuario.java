package Exercicio10;

public class Usuario implements Autenticavel {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void autenticar() {
        System.out.println("Usuário " + nome + " autenticado com sucesso.");
    }
}