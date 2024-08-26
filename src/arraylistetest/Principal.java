package arraylistetest;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Matheus");
        pessoa1.setIdade(26);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Lucca");
        pessoa2.setIdade(2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Lolly");
        pessoa3.setIdade(8);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeiro da lista: " + listaDePessoas.getFirst().getNome());
        System.out.println("Lista completa: " + listaDePessoas);

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);


        }
    }
}
