package projeto.alura.musica.modelo;

public class Podcasts extends Audio implements Exibicao{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }

    }

    @Override
    public void exibirFixaTecnica() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Descrição: " + descricao);
        System.out.println("Total de curtidas: " + getTotalCurtidas());
        System.out.println("Total de reprodução: " + getTotalReproducoes());
    }
}
