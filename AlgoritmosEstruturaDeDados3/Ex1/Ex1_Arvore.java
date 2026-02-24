class No {
    int valor;
    No esquerda, direita;

    No(int valor) {
        this.valor = valor;
    }
}

public class Ex1_Arvore {

    No raiz;

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, int valor) {
        if (atual == null) return new No(valor);

        if (valor < atual.valor)
            atual.esquerda = inserirRec(atual.esquerda, valor);
        else
            atual.direita = inserirRec(atual.direita, valor);

        return atual;
    }

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdem(no.direita);
        }
    }

    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    public static void main(String[] args) {
        Ex1_Arvore arvore = new Ex1_Arvore();
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);

        System.out.print("Em Ordem: ");
        arvore.emOrdem(arvore.raiz);

        System.out.print("\nPré Ordem: ");
        arvore.preOrdem(arvore.raiz);

        System.out.print("\nPós Ordem: ");
        arvore.posOrdem(arvore.raiz);
    }
}