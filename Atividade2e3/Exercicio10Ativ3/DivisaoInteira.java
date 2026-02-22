package Exercicio10Ativ3;

public class DivisaoInteira {

    public int dividir(int numero1, int numero2)
            throws DivisaoInteiraInvalidaException {

        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        if (numero1 % numero2 != 0) {
            throw new DivisaoInteiraInvalidaException(
                "Divisão inválida! O resultado não é exato."
            );
        }

        return numero1 / numero2;
    }
}