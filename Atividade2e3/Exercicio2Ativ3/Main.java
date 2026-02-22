package Exercicio2Ativ3;

public class Main {
    public static void main(String[] args) {

        ConversorTemperatura conversor = new ConversorTemperatura();

        try {
            double temperaturaCelsius = -300; // teste
            double fahrenheit = conversor.converterCelsiusParaFahrenheit(temperaturaCelsius);
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}