class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

public class Exercicio9 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Janaíne";
        p1.idade = 25;

        p1.apresentar();
    }
}