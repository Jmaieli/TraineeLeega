package Exercicio2Ativ3;

public class ConversorTemperatura {

    public double converterCelsiusParaFahrenheit(double temperaturaCelsius) {

        if (temperaturaCelsius < -273.15) {
            throw new IllegalArgumentException(
                "Temperatura inválida: abaixo do zero absoluto (-273.15°C)."
            );
        }

        return (temperaturaCelsius * 9 / 5) + 32;
    }
}