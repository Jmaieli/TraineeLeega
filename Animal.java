public class Animal {

    private String nome;
    private String alimentação;

    public Animal (String nome,String alimentação){

        this.nome = nome;
        this.alimentação =  alimentação;

    }

    public void emitirSom(){

        System.out.println("Animal" + nome + "Tipo de Alimentsção" + alimentação + "Está Roronando");
    }

    public String getAlimentação() {
        return alimentação;
    }
    public String getNome() {
        return nome;
    }
    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
