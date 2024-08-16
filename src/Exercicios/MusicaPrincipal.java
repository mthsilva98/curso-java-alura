package Exercicios;

public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.artista = "MC ig";
        musica.anoLancamento = 2024;

        musica.avaliar(9);
        musica.avaliar(7);
        musica.avaliar(7.8);
        musica.avaliar(8);
        musica.avaliar(9);

        musica.exibirFichaTecnica();
    }
}
