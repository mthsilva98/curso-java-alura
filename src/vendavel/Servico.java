package vendavel;

public class Servico implements Vendavel  {

    private String tipo;
    private double valorHora;


    @Override
    public double precoTotalProduto(int quantidade) {
        return valorHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        valorHora -= valorHora * (percentualDesconto /100);

    }
}
