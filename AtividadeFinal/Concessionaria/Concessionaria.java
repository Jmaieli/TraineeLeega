import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    public void adicionarCliente(Cliente c) {
        clientes.add(c);
    }

    // Método unificado para mostrar veículos
    public void mostrarVeiculos() {
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }

    public void mostrarClientes() {
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public void venderVeiculo(String modelo)
            throws VeiculoNaoEncontradoException, VendaInvalidaException {

        for (Veiculo v : veiculos) {

            if (v.modelo.equalsIgnoreCase(modelo)) {

                if (v.vendido) {
                    throw new VendaInvalidaException("Veículo já vendido.");
                }

                v.vendido = true;

                double lucro = v.calcularLucro();

                if (lucro >= 0) {
                    System.out.println("Venda com LUCRO de R$ " + lucro);
                } else {
                    System.out.println("Venda com PREJUÍZO de R$ " + lucro);
                }

                return;
            }
        }

        throw new VeiculoNaoEncontradoException("Veículo não encontrado.");
    }

    // Sugestão por biotipo
    public void sugerirVeiculo(Cliente cliente) {

        System.out.println("Sugestão para " + cliente);

        for (Veiculo v : veiculos) {

            if (!v.vendido) {

                if (cliente.getBiotipo().equalsIgnoreCase("pequeno")
                        && v instanceof Moto) {

                    System.out.println("Sugestão: " + v);
                    return;
                }

                if (cliente.getBiotipo().equalsIgnoreCase("grande")
                        && v instanceof Caminhonete) {

                    System.out.println("Sugestão: " + v);
                    return;
                }
            }
        }

        System.out.println("Nenhuma sugestão disponível.");
    }
}