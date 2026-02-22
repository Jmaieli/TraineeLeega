package Exercicio6Ativ3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            String texto = scanner.nextLine();

            int numero = Integer.parseInt(texto);

            System.out.println("Número convertido com sucesso: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor digitado não é um número inteiro válido.");
        }

        scanner.close();
    }
}