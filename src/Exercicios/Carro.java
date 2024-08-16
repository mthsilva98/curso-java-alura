package Exercicios;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exbirFichaTecnica () {
        System.out.println("Modelo do carro: " +modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
        System.out.println("Idade do carro: " + idadeCar() );
    }

    int idadeCar () {
        return 2024 - ano;
    }

}
