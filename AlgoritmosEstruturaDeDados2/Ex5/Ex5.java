package Ex5;

import java.util.ArrayList;
import java.util.Stack;

public class Ex5 {

    public static ArrayList<Integer> inverterComPilha(ArrayList<Integer> lista) {

        Stack<Integer> pilha = new Stack<>();

        for (Integer num : lista) {
            pilha.push(num);
        }

        ArrayList<Integer> invertida = new ArrayList<>();

        while (!pilha.isEmpty()) {
            invertida.add(pilha.pop());
        }

        return invertida;
    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println("Original: " + lista);

        ArrayList<Integer> invertida = inverterComPilha(lista);

        System.out.println("Invertida: " + invertida);
    }
}