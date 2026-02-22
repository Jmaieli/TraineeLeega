package Exercicio8;

import Exercicio2.Animal;
import Exercicio2.Ave;
import Exercicio2.Mamifero;
import Exercicio2.Peixe;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> listaAnimais = new ArrayList<>();

        listaAnimais.add(new Ave("Floresta", "Arara", "Curvo"));
        listaAnimais.add(new Mamifero("Savana", "Leão", "Terrestre"));
        listaAnimais.add(new Peixe("Oceano", "Tubarão", "Salgada"));

        for (Animal animal : listaAnimais) {
            animal.emitirSom();
        }
    }
}