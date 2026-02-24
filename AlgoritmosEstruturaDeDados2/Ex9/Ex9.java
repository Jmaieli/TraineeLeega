package Ex9;

import java.util.HashMap;

public class Ex9 {

    public static HashMap<String, Integer> mesclarMapas(
            HashMap<String, Integer> m1,
            HashMap<String, Integer> m2) {

        HashMap<String, Integer> resultado = new HashMap<>(m1);

        for (String chave : m2.keySet()) {
            resultado.put(chave,
                    resultado.getOrDefault(chave, 0) + m2.get(chave));
        }

        return resultado;
    }

    public static void main(String[] args) {

        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put("A", 1);
        mapa1.put("B", 2);

        HashMap<String, Integer> mapa2 = new HashMap<>();
        mapa2.put("B", 3);
        mapa2.put("C", 4);

        HashMap<String, Integer> resultado = mesclarMapas(mapa1, mapa2);

        System.out.println(resultado);
    }
}