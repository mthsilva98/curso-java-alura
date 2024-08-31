package buscacep;

import java.io.IOException;
import java.util.Scanner;

public class CepTest {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o número de cep para consulta:");
        var cep = leitura.nextLine();
        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizado a aplicação");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
