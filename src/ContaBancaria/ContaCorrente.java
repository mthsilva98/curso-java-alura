package ContaBancaria;

public class ContaCorrente extends ContaBancaria {

    private double tarifaMensal;

    public ContaCorrente (double saldoInicial, double tarifaMensal) {
        super(saldoInicial);
        this.tarifaMensal = tarifaMensal;

    }

    public void cobrarTarifaMensal() {
        if (tarifaMensal <= exibirSaldo()) {
            sacar(tarifaMensal);
            System.out.println("Tarifa mensal combrada no valor de R$ " + tarifaMensal);
        } else {
            System.out.println("Valor insuficiente.");
        }
    }




}
