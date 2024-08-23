package projeto.alura.musica.modelo;

public class Musicas extends Audio implements Exibicao  {
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

    @Override
    public void exibirFixaTecnica() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Album: " + album);
        System.out.println("Cantor: " + cantor);
        System.out.println("Genero: " + genero);
        System.out.println("Total de reprodução: " + getTotalReproducoes());
        System.out.println("Total de curtidas: " +getTotalCurtidas());


    }
}

