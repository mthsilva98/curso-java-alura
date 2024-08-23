package projeto.alura.musica.modelo;

public class Musicas extends Audio implements Exibicao, ClassificavelDois {
    private String cantor;
    private int anoLancamento;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
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
        System.out.println(getTitulo());
        System.out.println("Cantor: " + cantor);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + getDuracao());
        System.out.println("número de curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClasificacao());
        System.out.println("Total de repordução: " + getTotalDeReproducoes());
    }

    @Override
    public int clssificacaoId() {
        return clasificacaoEmCurtidas();                   // não to conseguinto achar a logica da classficação
    }
}

