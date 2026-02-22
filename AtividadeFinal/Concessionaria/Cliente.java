public class Cliente {

    private String nome;
    private String biotipo; // pequeno, medio, grande

    public Cliente(String nome, String biotipo) {
        this.nome = nome;
        this.biotipo = biotipo;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public String toString() {
        return "Cliente: " + nome + " | Biotipo: " + biotipo;
    }
}