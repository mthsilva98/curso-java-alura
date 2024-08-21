package calcularProduto;

public class Livro implements Calculavel {
    private String titulo;
    private double precoBase;
    private double desconto;

    public Livro(String titulo, double precoBase, double desconto) {
        this.titulo = titulo;
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * desconto / 100);
    }
}
