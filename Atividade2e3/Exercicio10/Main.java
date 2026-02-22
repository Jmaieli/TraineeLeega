package Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Autenticavel> lista = new ArrayList<>();

        lista.add(new Usuario("Janaine"));
        lista.add(new Administrador("Carlos"));

        for (Autenticavel item : lista) {
            item.autenticar();
        }
    }
}