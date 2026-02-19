public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        circulo.calcular();

        System.out.println("Raio: "+ circulo.getRaio());
        System.out.println("Área: "+ circulo.getArea());
        System.out.println("Perimetro: "+ circulo.getPerimetro());


        Pessoa pessoa = new Pessoa("Janaine", 31);
        pessoa.cumprimentar();

        Livro livro = new Livro("junji Ito", "Uzumaki", 668);
        livro.detalhes();

        Retangulo retangulo = new Retangulo(2, 6);
        retangulo.calculaAreaPerimetro();

        Animal animal1 = new Animal ("gato", "ração");
        animal1.emitirSom();

        Produto produto = new Produto("Pastel", 10);
        double precoDesconto = produto.calcDesconto(3);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço original: R$ " + produto.getPreco());
        System.out.println("Preço com desconto: R$ " + precoDesconto);

        Triangulo triangulo = new Triangulo(6, 10);
       System.out.println("Area do Triangulo: " + triangulo.calcAreaTriangulo());
        
        ContaBancaria conta = new ContaBancaria("12345-6", 1000.00);

        conta.depositar(500);
        conta.sacar(300);

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo atual: R$ " + conta.getSaldo());


        Carro carro1 = new Carro("volkswagen", "Fusca", 1938);

        carro1.ligar();
        carro1.acelerar(50);
        carro1.acelerar(30);
        carro1.desligar();
    }

}
