public class Main {

    public static void main(String[] args) {

        Concessionaria c = new Concessionaria();

        c.adicionarVeiculo(new Carro("Civic", 50000, 60000));
        c.adicionarVeiculo(new Moto("CG 160", 8000, 12000));
        c.adicionarVeiculo(new Caminhonete("Hilux", 120000, 150000));

        c.adicionarCliente(new Cliente("Ana", "pequeno"));
        c.adicionarCliente(new Cliente("Carlos", "grande"));

        c.mostrarVeiculos();
        c.mostrarClientes();

        try {
            c.venderVeiculo("Civic");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}