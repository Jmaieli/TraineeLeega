import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        int inicio = 0;
        int fim = lista.size() - 1;

        while (inicio < fim) {
            int temp = lista.get(inicio);
            lista.set(inicio, lista.get(fim));
            lista.set(fim, temp);

            inicio++;
            fim--;
        }

        System.out.println(lista);
    }
}