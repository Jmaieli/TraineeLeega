package Ex3;
import java.util.ArrayList;

public class Ex3 {

    public static ArrayList<Integer> mesclar(ArrayList<Integer> l1, ArrayList<Integer> l2) {

        ArrayList<Integer> resultado = new ArrayList<>();
        int tamanho = Math.max(l1.size(), l2.size());

        for (int i = 0; i < tamanho; i++) {
            if (i < l1.size()) resultado.add(l1.get(i));
            if (i < l2.size()) resultado.add(l2.get(i));
        }

        return resultado;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(3);
        lista1.add(5);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        lista2.add(8);

        ArrayList<Integer> resultado = mesclar(lista1, lista2);

        System.out.println("Lista mesclada: " + resultado);
    }
}