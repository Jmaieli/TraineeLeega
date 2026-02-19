public class Retangulo {

    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;

    }

    public void calculaAreaPerimetro(){
        double area = comprimento * largura;
        double Perimetro = 2 * (comprimento + largura);

        System.out.println("Área: " + area);
        System.out.println("Perimetro: " + Perimetro);

    }

    public double getComprimento() {
        return comprimento;
    }
    public double getLargura() {
        return largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
}
