package conversorMoedas;

public class ConversorMoeda implements ConversaoFinanceira {


    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacao = 4.80;
        double valorEmReais = valorDolar * cotacao;
        System.out.println("Valor do dolar em reais é: R$" + valorEmReais);
    }
}
