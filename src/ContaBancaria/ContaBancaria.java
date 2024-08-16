package ContaBancaria;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Matheus Silva";
        String tipoConta ="Corrente";
        double saldo = 3500;
        int opcao = 0;




        System.out.println("********************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("\n*******************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - sair
                """;


        while (opcao !=4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Quanto deseja transferir ?");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                }else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado R$ " + saldo);

                }
            } else if (opcao == 3) {
                System.out.println("Digite quanto quer receber");
                double receber = scanner.nextDouble();
                saldo += receber;
                System.out.println("Saldo atualizado R$ " + saldo);


            } else if (opcao == 4) {
                System.out.println("Operação finalizada!");

            }else {
                System.out.println("Tente outra opção");
            }
        }

    }

}










