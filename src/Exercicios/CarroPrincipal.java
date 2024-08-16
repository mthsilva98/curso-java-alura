package Exercicios;

public class CarroPrincipal {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Chevet";
        carro.ano = 1975;
        carro.cor = "vermehlo";

        carro.exbirFichaTecnica();
    }
}
