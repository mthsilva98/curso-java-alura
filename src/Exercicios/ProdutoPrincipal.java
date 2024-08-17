package Exercicios;

public class ProdutoPrincipal {
    public static void main(String[] args) {

        Produto produto = new Produto("Celular", 2000);

        System.out.println("Nome do Produto " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo preço após Desconto: " + produto.getPreco());

    }
}
