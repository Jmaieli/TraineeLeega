public class Ex3_BuscaLinear {

    public static int buscaLinear(int[] array, int alvo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == alvo) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {4, 2, 7, 9, 1};
        System.out.println(buscaLinear(numeros, 7));
    }
}