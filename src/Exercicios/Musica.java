package Exercicios;

public class Musica {
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int totalAvaliacoes;


    void exibirFichaTecnica() {
        System.out.println("Nome artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Numero de avaliação: " + totalAvaliacoes);
        System.out.println("Média de avaliação: " + media());
    }

    void avaliar (double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double media () {
       return somaAvaliacoes / totalAvaliacoes;
    }

}
