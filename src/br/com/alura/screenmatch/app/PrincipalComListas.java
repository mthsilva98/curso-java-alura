package br.com.alura.screenmatch.app;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("As tranças do rei careca", 2024);
        outroFilme.avalia(6);

        var filmeMatheus = new Filme("Matrix", 2022);
        filmeMatheus.avalia(10);

        Serie lost = new Serie("Lost", 2005);

        Filme f1 = filmeMatheus; // Isso é uma variável de referência, ela está se referindo a filmeMatheus

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeMatheus);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);


        for(Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme) {
             // Filme filme = (Filme) titulo; Exemplo usando em javas mais antigos antigo
                System.out.println("Classificação " + filme.getClassificacao());
            }




        }

    }
}
