package Ex10;

import java.util.ArrayList;

public class Ex10 {

    public static void bubbleSortDecrescente(ArrayList<Integer> lista) {

        for (int i = 0; i < lista.size() - 1; i++) {

            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j) < lista.get(j + 1)) {

                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(1);
        lista.add(8);
        lista.add(3);

        System.out.println("Antes: " + lista);

        bubbleSortDecrescente(lista);

        System.out.println("Depois (decrescente): " + lista);
    }
}