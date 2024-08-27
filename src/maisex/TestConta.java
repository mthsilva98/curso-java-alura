package maisex;

import java.util.ArrayList;

public class TestConta {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("001", 578);
        ContaBancaria contaBancaria2 = new ContaBancaria("002", 1500.30);
        ContaBancaria contaBancaria3 = new ContaBancaria("003", 3250.50);


        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

        listaDeContas.add(contaBancaria1);
        listaDeContas.add(contaBancaria2);
        listaDeContas.add(contaBancaria3);


        ContaBancaria contaMaiorSaldo = listaDeContas.getFirst();
        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroDaConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}