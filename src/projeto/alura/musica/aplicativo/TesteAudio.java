package projeto.alura.musica.aplicativo;

import projeto.alura.musica.modelo.Musicas;

public class TesteAudio {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();

        musicas.setTitulo("Quem manda é a 30");
        musicas.setDuracao(2.30);
        musicas.setTotalDeReproducoes(58);
        musicas.setCurtidas(780);

        musicas.setCantor("Matue");
        musicas.setAnoLancamento(2020);
        musicas.exibirFixaTecnica();
        musicas.reproduzirAudio();


    }
}
