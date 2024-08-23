package projeto.alura.musica.modelo;

public class FiltrarClassificacao extends Audio {

    public void filrar(ClassificavelDois clasificavel) {
        if(clasificavel.clssificacaoId() >= 100) {
            System.out.println("Esta em alta!");
        } else if (clasificavel.clssificacaoId() <= 50) {
            System.out.println("Vale a pena escutar!");

        }
    }

}
