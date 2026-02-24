public class Ex2_ValidarBST {

    public static boolean validarBST(No no, Integer min, Integer max) {
        if (no == null) return true;

        if ((min != null && no.valor <= min) ||
            (max != null && no.valor >= max))
            return false;

        return validarBST(no.esquerda, min, no.valor) &&
               validarBST(no.direita, no.valor, max);
    }

    public static void main(String[] args) {
        Ex1_Arvore arvore = new Ex1_Arvore();
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);

        System.out.println(validarBST(arvore.raiz, null, null));
    }
}