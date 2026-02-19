public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " ligado!");
        } else {
            System.out.println(modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println(modelo + " desligado!");
        } else {
            System.out.println(modelo + " já está desligado.");
        }
    }

    public void acelerar(int incremento) {
        if (ligado) {
            if (incremento > 0) {
                velocidade += incremento;
                System.out.println(modelo + " acelerou para " + velocidade + " km/h.");
            } else {
                System.out.println("Incremento inválido!");
            }
        } else {
            System.out.println("O carro está desligado. Ligue o carro primeiro.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }
}