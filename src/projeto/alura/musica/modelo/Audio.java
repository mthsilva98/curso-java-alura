package projeto.alura.musica.modelo;

public class Audio {

    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int clasificacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClasificacao() {
        return clasificacao;
    }

    public void setClasificacao(int clasificacao) {
        this.clasificacao = clasificacao;
    }

    public int clasificacaoEmCurtidas(int curtidas){
        return clasificacao += curtidas;

    }
    public void reproduzirAudio() {
        System.out.println("Esta tocanto o audio");

    }

}
