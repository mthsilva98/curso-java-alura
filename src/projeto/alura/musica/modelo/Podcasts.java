package projeto.alura.musica.modelo;

public class Podcasts extends Audio implements Exibicao, ClassificavelDois {
    private int episodio;
    private String entrevistado;

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getEntrevistado() {
        return entrevistado;
    }

    public void setEntrevistado(String entrevistado) {
        this.entrevistado = entrevistado;
    }

    @Override
    public int clasificacaoEmCurtidas(int curtidas) {
        return super.clasificacaoEmCurtidas(curtidas);
    }

    @Override
    public void reproduzirAudio() {
        System.out.println("Esta tocando: " + getTitulo());
    }

    @Override
    public void exibirFixaTecnica() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Episódio: " + episodio);
        System.out.println("Entrevistado: " + entrevistado);
        System.out.println("Duração: " + getDuracao());
        System.out.println("número de curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClasificacao());
        System.out.println("Total de repordução: " + getTotalDeReproducoes());

    }

    @Override
    public int clssificacaoId() {
        return getCurtidas();
    }
}
