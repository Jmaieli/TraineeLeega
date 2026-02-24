import java.util.*;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            lista.add(sc.nextInt());
        }

        int maisFrequente = lista.get(0);
        int maiorContagem = 0;

        for (int i = 0; i < lista.size(); i++) {
            int contagem = 0;

            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    contagem++;
                }
            }

            if (contagem > maiorContagem) {
                maiorContagem = contagem;
                maisFrequente = lista.get(i);
            }
        }

        System.out.println("Número mais repetido: " + maisFrequente);
        sc.close();
    }
}