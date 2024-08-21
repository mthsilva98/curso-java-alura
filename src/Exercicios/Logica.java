package Exercicios;

import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário quantos termos da sequência de Fibonacci deseja exibir
        System.out.print("Quantos termos da sequência de Fibonacci deseja exibir? ");
        int n = scanner.nextInt();

        int primeiro = 0, segundo = 1;

        System.out.println("Sequência de Fibonacci até " + n + " termos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");

            // Atualiza os valores para o próximo termo
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        scanner.close();
    }
}
