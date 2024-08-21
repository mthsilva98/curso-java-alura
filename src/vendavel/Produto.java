package vendavel;

public class Produto implements Vendavel  {

    private String nome;
    private double precoUnitario;



    public Produto (String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }


    @Override
    public double precoTotalProduto(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoUnitario -= precoUnitario * (percentualDesconto /100);

    }
    public double precoTotalComDesconto(int quantidade, double percentualDesconto) {
        double precoComDesconto = precoUnitario - (precoUnitario * (percentualDesconto / 100));
        return precoComDesconto * quantidade;
    }
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoUnitario=" + precoUnitario +
                '}';
    }

}
