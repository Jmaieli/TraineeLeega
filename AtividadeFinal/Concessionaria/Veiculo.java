public abstract class Veiculo {

    protected String modelo;
    protected double precoCompra;
    protected double precoVenda;
    protected boolean vendido;

    public Veiculo(String modelo, double precoCompra, double precoVenda) {
        this.modelo = modelo;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.vendido = false;
    }

    public double calcularLucro() {
        return precoVenda - precoCompra;
    }

    public abstract String getTipo();

    public String toString() {
        return getTipo() + " - " + modelo +
               " | Venda: R$ " + precoVenda +
               " | Vendido: " + vendido;
    }
}