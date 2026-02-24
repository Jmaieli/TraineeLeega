public class Ex8_MinimoBST {

    public static int minimo(No raiz) {
        while (raiz.esquerda != null) {
            raiz = raiz.esquerda;
        }
        return raiz.valor;
    }

    public static void main(String[] args) {
        Ex1_Arvore arvore = new Ex1_Arvore();
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);

        System.out.println("Menor valor: " + minimo(arvore.raiz));
    }
}