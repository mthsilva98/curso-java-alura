package carro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(45000, 58000, 79000);
        meuCarro.exibirInfo();
    }
}
