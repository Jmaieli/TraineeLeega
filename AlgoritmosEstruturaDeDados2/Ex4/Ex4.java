package Ex4;
 import java.util.Stack;

public class Ex4 {

    public static boolean estaBalanceado(String expressao) {

        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {

            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) return false;
                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {

        String expressao = "(2 + 3) * (5 - 1)";

        if (estaBalanceado(expressao)) {
            System.out.println("Expressão balanceada!");
        } else {
            System.out.println("Expressão NÃO balanceada!");
        }
    }
}