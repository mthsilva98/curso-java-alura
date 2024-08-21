package calcularProduto;

public class ProdutoFisico implements Calculavel {
    private String nome;
    private double precoBase;
    private double taxaAdicional;

    public ProdutoFisico(String nome, double precoBase, double taxaAdicional) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * taxaAdicional / 100);
    }
}
