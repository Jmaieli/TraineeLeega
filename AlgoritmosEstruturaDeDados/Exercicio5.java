public class Exercicio5 {
    public static void main(String[] args) {

        int[] numeros = {10, 25, 3, 89, 40};

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Maior número: " + maior);
    }
}