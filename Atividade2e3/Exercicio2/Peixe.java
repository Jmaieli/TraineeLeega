package Exercicio2;

public class Peixe extends Animal {

    private String tipoAgua;

    public Peixe(String habitat, String nome, String tipoAgua) {

        super(habitat, nome);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public void soltarbolhas() {
        System.out.println("tilápias não soltam bolhas!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixes fazem Blu Blu!");
    }
}
