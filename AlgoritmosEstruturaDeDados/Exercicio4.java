import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Mostrar lista");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    lista.add(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Digite o número para remover: ");
                    lista.remove(Integer.valueOf(sc.nextInt()));
                    break;

                case 3:
                    System.out.println(lista);
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}