package vendavel;

public class Produto implements Vendavel {

    private String nome;
    private double precoUnitario;


    @Override
    public double precoTotalProduto(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto / 100);

    }
}
