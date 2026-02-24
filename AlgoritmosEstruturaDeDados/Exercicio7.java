import java.util.Scanner;

public class Exercicio7 {

    static char[][] tabuleiro = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char jogador = 'X';

        for (int rodada = 0; rodada < 9; rodada++) {

            imprimirTabuleiro();

            System.out.println("Jogador " + jogador);
            System.out.print("Linha (0-2): ");
            int linha = sc.nextInt();
            System.out.print("Coluna (0-2): ");
            int coluna = sc.nextInt();

            if (tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogador;
                jogador = (jogador == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Posição ocupada!");
                rodada--;
            }
        }

        imprimirTabuleiro();
        sc.close();
    }

    static void imprimirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            System.out.println(tabuleiro[i][0] + "|" + tabuleiro[i][1] + "|" + tabuleiro[i][2]);
        }
        System.out.println("-----");
    }
}