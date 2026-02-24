public class Ex4_BuscaBinaria {

    public static int buscaBinaria(int[] array, int alvo) {
        int inicio = 0, fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == alvo) return meio;
            if (array[meio] < alvo)
                inicio = meio + 1;
            else
                fim = meio - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 4, 7, 9};
        System.out.println(buscaBinaria(numeros, 7));
    }
}