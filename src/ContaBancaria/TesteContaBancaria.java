package ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(7000, 80);

        contaCorrente.cobrarTarifaMensal();
        System.out.println("Valor atualizado: R$ " + contaCorrente.exibirSaldo());
        contaCorrente.depositar(780);
        System.out.println("Valor atualizado: R$ " + contaCorrente.exibirSaldo());
        contaCorrente.sacar(2000);
        System.out.println("Valor atualizado: R$ " + contaCorrente.exibirSaldo());



    }
}
