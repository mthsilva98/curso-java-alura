package Exercicios;

public class UsandoCasting {
    public static void main(String[] args) {
        double numero1 = 5.6;
        int numero2 = 7;
         // essa manaeira
        int soma = (int) numero1 + numero2;

        // ou essa maneira
        int numeroInteiro = (int) numero1;

        System.out.println(soma);
    }
}
