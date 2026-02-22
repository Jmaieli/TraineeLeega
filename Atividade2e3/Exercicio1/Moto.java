package Exercicio1;

public class Moto extends Veiculo{
    private String cor;
    private String tipoFreio;
    private double velocidade;

    public Moto(String modelo, int ano, String cor, String tipoFreio, double velocidade){
        super(modelo, ano);
        this.cor = cor;
        this.tipoFreio = tipoFreio;
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }
    public String getTipoFreio() {
        return tipoFreio;
    }
    public double getVelocidade() {
        return velocidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void frear(){
         if (velocidade > 100) {
            System.out.println("Velocidade alta!");
            System.out.println("Freio ABS acionado!");
        } else {
        }
    }
    
}