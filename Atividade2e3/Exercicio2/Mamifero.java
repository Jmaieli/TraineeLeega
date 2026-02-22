package Exercicio2;

public class Mamifero extends Animal {

    private String temPelos;

    public Mamifero(String habitat, String nome, String temPelos) {

        super(habitat, nome);
        this.temPelos = temPelos;
    }

    public String getTemPelos() {
        return temPelos;
    }

    public void setTemPelos(String temPelos) {
        this.temPelos = temPelos;
    }

    public void comer() {
        System.out.println("O leão come outros mamiferos");
    }

    @Override
    public void emitirSom() {
        System.out.println("O Leão Rugi  aaaaaarrggg!");
    }
}
