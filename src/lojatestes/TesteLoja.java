package lojatestes;

import java.util.ArrayList;

public class TesteLoja {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camisa", 59.90, 80);

        Produto produto2 = new Produto("Meia", 19.90, 40);

        Produto produto3 = new Produto("Calça", 78.90, 32);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Mostra o segundo intem da lista: " + listaDeProdutos.get(1).getNome());

        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }


        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 4.87, 2, "15/09/2024");

        System.out.println(produtoPerecivel);






    }
}
