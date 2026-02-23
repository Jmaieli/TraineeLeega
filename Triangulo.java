public class Triangulo {
    private double base;
    private double altura;


    public Triangulo(double base, double altura){
    
        this.base = base;
        this.altura = altura;
    }

    public double calcAreaTriangulo(){
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
