public class Caminhonete extends Veiculo {

    public Caminhonete(String modelo, double precoCompra, double precoVenda) {
        super(modelo, precoCompra, precoVenda);
    }

    @Override
    public String getTipo() {
        return "Caminhonete";
    }
}