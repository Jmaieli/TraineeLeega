package Exercicio1;

public class Carro extends Veiculo{
    private String cor;
    private String combustivel;
    private String portaMalas;

    public Carro(String modelo, int ano, String cor, String combustivel, String portaMalas){
        super(modelo, ano);
        this.cor = cor;
        this.combustivel = combustivel;
        this.portaMalas = portaMalas;
    }

    public String getCor() {
        return cor;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public String getPortaMalas() {
        return portaMalas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public void setPortaMalas(String portaMalas) {
        this.portaMalas = portaMalas;
    }

    public void AbrirPortaMalas()
    {
       System.out.println("Porta-malas aberto!");
    }


}