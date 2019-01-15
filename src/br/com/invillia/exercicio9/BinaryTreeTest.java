package br.com.invillia.exercicio9;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree umaArvore = new BinaryTree();

        umaArvore.setValor(20);
        umaArvore.adicionaNo(umaArvore);
        umaArvore.adicionaNo(umaArvore.getLeft());
        umaArvore.adicionaNo(umaArvore.getRight());

        System.out.println("Soma 1:" + umaArvore.soma(umaArvore));

        umaArvore.adicionaNo(umaArvore.getLeft());
        umaArvore.adicionaNo(umaArvore.getLeft().getLeft());
        umaArvore.adicionaNo(umaArvore.getLeft().getLeft().getLeft());

        System.out.println("Soma 2:" + umaArvore.soma(umaArvore));


        BinaryTree outraArvore = new BinaryTree();
        outraArvore.setValor(15);
        outraArvore.adicionaNo(outraArvore);
        outraArvore.adicionaNo(outraArvore.getRight());
        outraArvore.adicionaNo(outraArvore.getRight().getRight());
        outraArvore.adicionaNo(outraArvore.getRight().getRight().getRight());
        outraArvore.adicionaNo(outraArvore.getRight().getRight().getRight().getRight());
        outraArvore.adicionaNo(outraArvore.getRight().getRight().getRight().getRight().getRight());

        System.out.println("Soma 3:" + outraArvore.soma(outraArvore));
    }
}
