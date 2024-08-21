package vendavel;

public class Servico implements Vendavel {

    private String descricao;
    private double precoHora;


    @Override
    public double precoTotalProduto(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100);

    }
}
