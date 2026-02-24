import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void atualizarQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void exibirProduto() {
        System.out.println("ID: " + id +
                " | Nome: " + nome +
                " | Quantidade: " + quantidade +
                " | Preço: R$ " + preco);
    }
}

public class SistemaEstoque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n===== MENU ESTOQUE =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    estoque.add(new Produto(id, nome, quantidade, preco));
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    System.out.print("Digite o ID do produto para remover: ");
                    int idRemover = sc.nextInt();

                    Produto produtoRemover = null;

                    for (Produto p : estoque) {
                        if (p.getId() == idRemover) {
                            produtoRemover = p;
                            break;
                        }
                    }

                    if (produtoRemover != null) {
                        estoque.remove(produtoRemover);
                        System.out.println("Produto removido!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o ID do produto para atualizar: ");
                    int idAtualizar = sc.nextInt();

                    boolean encontrado = false;

                    for (Produto p : estoque) {
                        if (p.getId() == idAtualizar) {

                            System.out.print("Nova quantidade: ");
                            int novaQtd = sc.nextInt();
                            p.atualizarQuantidade(novaQtd);

                            System.out.print("Novo preço: ");
                            double novoPreco = sc.nextDouble();
                            p.atualizarPreco(novoPreco);

                            System.out.println("Produto atualizado!");
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                    } else {
                        for (Produto p : estoque) {
                            p.exibirProduto();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}