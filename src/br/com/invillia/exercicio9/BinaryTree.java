package br.com.invillia.exercicio9;

public class BinaryTree {

    int valor;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree() {
    }

    public BinaryTree(int Valor) {
        this.valor = valor;
    }

    public BinaryTree(int Valor, BinaryTree left, BinaryTree right) {
        this.valor = valor;
        this.left = left;
        this.right = right;
    }

    public int getValor() {
        return valor;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public int soma(BinaryTree no) {

        int somaNo = 0;

        if (no.getLeft() != null) {
            somaNo += soma(no.getLeft());
        }
        if (no.getRight() != null) {
            somaNo += soma(no.getRight());
        }
        somaNo += no.getValor();
        return somaNo;
    }

    public static void adicionaNo(BinaryTree add) {
        BinaryTree left = new BinaryTree(add.getValor());
        BinaryTree rigth = new BinaryTree(add.getValor());
        add.setLeft(left);
        add.setRight(rigth);
    }
}
