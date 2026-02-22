package Exercicio5Ativ3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitorArquivo {

    public void lerArquivo(String caminho) {

        try {
            File arquivo = new File(caminho);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado!");
        }
    }
}