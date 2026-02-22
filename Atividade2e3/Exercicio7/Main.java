package Exercicio7;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica c = new Circulo(5);
        FormaGeometrica r = new Retangulo(4, 6);
        FormaGeometrica t = new Triangulo(3, 4, 3, 4, 5);

        System.out.println("Área círculo: " + c.calcularArea());
        System.out.println("Perímetro círculo: " + c.calcularPerimetro());

        System.out.println("Área retângulo: " + r.calcularArea());
        System.out.println("Perímetro retângulo: " + r.calcularPerimetro());

        System.out.println("Área triângulo: " + t.calcularArea());
        System.out.println("Perímetro triângulo: " + t.calcularPerimetro());
    }
}