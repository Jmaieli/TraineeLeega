public class Moto extends Veiculo {

    public Moto(String modelo, double precoCompra, double precoVenda) {
        super(modelo, precoCompra, precoVenda);
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}