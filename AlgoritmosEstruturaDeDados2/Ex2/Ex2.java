package Ex2;

import java.util.ArrayList;

public class Ex2 {

    public static ArrayList<Integer> removerDuplicados(ArrayList<Integer> lista) {

        ArrayList<Integer> novaLista = new ArrayList<>();

        for (Integer num : lista) {
            if (!novaLista.contains(num)) {
                novaLista.add(num);
            }
        }

        return novaLista;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(1);

        System.out.println("Lista original: " + lista);

        ArrayList<Integer> semDuplicados = removerDuplicados(lista);

        System.out.println("Sem duplicados: " + semDuplicados);
    }
}