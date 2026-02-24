package Ex8;

import java.util.HashMap;

public class Ex8 {

     public static void contarPalavras(String frase) {

        HashMap<String, Integer> mapa = new HashMap<>();

        String[] palavras = frase.toLowerCase().split(" ");

        for (String palavra : palavras) {
            mapa.put(palavra, mapa.getOrDefault(palavra, 0) + 1);
        }

        System.out.println(mapa);
    }

    public static void main(String[] args) {

        String frase = "java é legal e java é poderoso";

        contarPalavras(frase);
    }
}
