package Exercicio2;

public class Animal {

    private String habitat;
    private String nome;

    public Animal(String habitat, String nome) {
        this.habitat = habitat;
        this.nome = nome;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

}
