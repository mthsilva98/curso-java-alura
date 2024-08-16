package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativa = 0;
        int numeroDigitado = 0;



        while (numeroTentativa < 5) {
            System.out.println("Digite o número entrre 0 e 100: ");
            numeroDigitado = scaner.nextInt();
            numeroTentativa++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Parabéns você acertou o número em " + numeroTentativa + " tentativas!" );
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número é maior que número digitado");

            } else {
                System.out.println("O número é maior que o número digitado");
            }

        }
        if (numeroTentativa == 5 && numeroDigitado != numeroAleatorio) {
            System.out.println("Você não acertou o número em 05 tentativas.");
        }







    }
}
