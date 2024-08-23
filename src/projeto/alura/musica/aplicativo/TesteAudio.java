package projeto.alura.musica.aplicativo;

import projeto.alura.musica.modelo.MinhasPreferidas;
import projeto.alura.musica.modelo.Musicas;
import projeto.alura.musica.modelo.Podcasts;

public class TesteAudio {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();


        minhaMusica.setTitulo("Melhor album do matue");
        minhaMusica.setAlbum("Maquina do tempo");
        minhaMusica.setCantor("Matue");
        minhaMusica.setGenero("Trap");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.repoduz();

        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();

        }


        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("Flow");
        meuPodcast.setApresentador("Igor");
        meuPodcast.setDescricao("O entrevistado de hoje é o Matheus, mais conhecido como rei do JAVA!");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.repoduz();

        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();

        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        meuPodcast.exibirFixaTecnica();
        preferidas.inclui(meuPodcast);

        minhaMusica.exibirFixaTecnica();
        preferidas.inclui(minhaMusica);
    }
}
