package novosex;

import java.util.Scanner;

public class DivisaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeor número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextDouble();

            double resultado = numero1 / numero2;
            System.out.println("O resultado da divisao é : " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possivel reslver por zero");
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida");
        } finally {
            scanner.close();
        }
    }
}
