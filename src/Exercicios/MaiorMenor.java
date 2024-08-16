package Exercicios;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("O número " +numero1 + " é igual o número " + numero2);
        } else if (numero1 > numero2) {
            System.out.println("O número " +numero1 + " é maior que o número " + numero2);
        } else {
            System.out.println("O número " +numero1 + " é menor que o número " + numero2);
        }
    }
}
