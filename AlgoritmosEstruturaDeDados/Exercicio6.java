public class Exercicio6 {
    public static void main(String[] args) {

        for (int numero = 2; numero <= 100; numero++) {

            boolean primo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(numero + " ");
            }
        }
    }
}