
public class Circulo {

    private double raio;
    private double area;
    private double perimetro;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void calcular(){
        this.area = Math.PI * Math.pow(raio, 2);
        this.perimetro = 2 * Math.PI * raio;
    }


    public double getArea() {
        return raio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}

