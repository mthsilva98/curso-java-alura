package ContaBancaria;


public class ContaBancaria {

    private double saldo;


    public ContaBancaria (double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (saldo > 0) {
            saldo += valor;
            System.out.println("Deposito no valor de R$ " + valor + " feito com sucesso.");

        } else {
            System.out.println("Valor tem que ser maior que zero");
        }
    }
    public  void sacar (double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque no valor de R$ " + valor + " feito com sucesso.");
        } else {
            System.out.println("Valor insuficiente ou deve ser maior que zero.");
        }
    }
    public double exibirSaldo() {
        return saldo;
    }


}
