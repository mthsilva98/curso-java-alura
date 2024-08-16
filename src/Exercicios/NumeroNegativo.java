package Exercicios;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Digite um número inteiro (ou pressione 'q' para sair): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                running = false;
                System.out.println("Programa encerrado.");
            } else {
                try {
                    int numero = Integer.parseInt(input);
                    if (numero > 0) {
                        System.out.println("O número é positivo.");
                    } else if (numero < 0) {
                        System.out.println("O número é negativo.");
                    } else {
                        System.out.println("O número é zero.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                }
            }
        }

        scanner.close();
    }

        }





