package Exercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         Calculadora calc = new Calculadora();

          Scanner scanner = new Scanner(System.in);

         //Atividade 3 Exercicio 1

        // try {
        //     double resultado = calc.dividirComException(10, 0);
        //     System.out.println("Resultado: " + resultado);
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Erro: " + e.getMessage());
        // }

            //Atividade 2 Exercicio 6

        //System.out.println(calc.soma(5, 3));
        //System.out.println(calc.soma(2.5, 3.5));
        //System.out.println(calc.soma(1, 2, 3));

        //System.out.println(calc.dividir(10, 4));
        //System.out.println(calc.dividir(10.0, 4.0));

                // Atividade 3 Exercicio 4
                
        try {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            int resultado = numero / 0; // divisão por zero proposital

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!.");
        }

        scanner.close();
    }
}


