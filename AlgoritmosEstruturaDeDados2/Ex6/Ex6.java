package Ex6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== FILA DE ESPERA =====");
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Chamar próxima pessoa");
            System.out.println("3 - Exibir fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    fila.add(nome);
                    System.out.println("Pessoa adicionada!");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia!");
                    } else {
                        System.out.println("Chamando: " + fila.poll());
                    }
                    break;

                case 3:
                    System.out.println("Fila atual: " + fila);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}