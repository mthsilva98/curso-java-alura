package br.com.alura.screenmatch.app;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme " +meuFilme.getDuracaoEmMinutos());
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie("Lost", 2005);
        lost.exibeFichaTecnica();
        lost.setTempradas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("A trança do rei careca", 2024);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeMatheus = new Filme("Dogville", 2022);
        filmeMatheus.setDuracaoEmMinutos(200);
        //filmeMatheus.setNome("Matrix");  Essa linha agora esta na linha 62
        filmeMatheus.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeMatheus);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.getFirst().getNome());
        System.out.println("Toda lista: " + listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.getFirst().toString());





    }
}
