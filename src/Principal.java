import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme " +meuFilme.getDuracaoEmMinutos());
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2005);
        lost.exibeFichaTecnica();
        lost.setTempradas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("A trança do rei careca");
        outroFilme.setAnoDeLancamento(2024);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());







    }
}
