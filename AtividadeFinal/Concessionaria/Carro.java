public class Carro extends Veiculo {

    public Carro(String modelo, double precoCompra, double precoVenda) {
        super(modelo, precoCompra, precoVenda);
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}