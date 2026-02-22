import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       CadastraAluno cadastro = new CadastraAluno();
       Scanner scanner = new Scanner(System.in);

       boolean continuar = true;
       while (continuar) {
            System.out.println("Escolha uma opção abaixo: ");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Mostrar alunos cadastrafos");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe o idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Informe o curso do aluno: ");
                    String curso = scanner.nextLine();

                    cadastro.CadastraAluno(new Aluno(nome, idade, curso));
                    System.out.print("Aluno cadastrado com sucesso");
                    break;

                case 2:
                    System.out.print("Alunos Cadastrados: ");
                    cadastro.mostrarAlunos();
                    break;

                case 3:
                    continuar = false;
                    break;
            
                default:
                    System.out.print("Opção digitada é invalida! Tente novamente!");
                    break;
            }
       }

       scanner.close();
       System.out.println("Programa Encerrado!");
    }

}
