package Exercicio3Ativ3;

public class Idade {
    public void verificarIdade(int idade) {

        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException(
                "Idade inválida! A idade deve ser entre 0 e 150 anos."
            );
        }

         System.out.println("Idade válida: " + idade + " anos.");
    }

}
