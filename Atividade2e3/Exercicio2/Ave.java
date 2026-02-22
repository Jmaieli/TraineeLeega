package Exercicio2;

public class Ave extends Animal {

    private String tipoBico;

    public Ave(String habitat, String nome, String tipoBico) {

        super(habitat, nome);
        this.tipoBico = tipoBico;
    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    public void botarOvo() {

        System.out.println("O Bico de sapato bota um ovo 164 gramas, tipo um ovo de pascoa");
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave canta: Piu piu!");
    }
}