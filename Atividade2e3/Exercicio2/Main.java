package Exercicio2;

public class Main {

    public static void main(String[] args) {
        
        Mamifero mamifero = new Mamifero("Savana", "Leão", "Sim");

        Peixe peixe = new Peixe("rio", "tilapia", "doce");

        Ave ave = new Ave("Pantano", "bico de sapato", "sapato");

        System.out.println("Mamifero:");
        System.out.println("Habitate:  "+ mamifero.getHabitat());
        System.out.println("Nome:      "+ mamifero.getNome());
        System.out.println("TEm Pelos: "+ mamifero.getTemPelos());
        mamifero.emitirSom();
        System.out.println();
        

        System.out.println("Peixe: ");
        System.out.println("Habitate:     "+ peixe.getHabitat());
        System.out.println("Nome:         "+ peixe.getNome());
        System.out.println("Tipo de Água: "+ peixe.getTipoAgua());

        peixe.emitirSom();
        System.out.println();

        System.out.println("Ave");
        System.out.println("Habitate: "+ ave.getHabitat());
        System.out.println("Nome:     "+ ave.getNome());
        System.out.println("Ave:      "+ ave.getTipoBico());
        ave.emitirSom();
        System.out.println();
    }
}
