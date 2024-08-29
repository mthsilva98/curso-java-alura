package usandoapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Themealdb {

        public static void main(String[] args) throws IOException, InterruptedException {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o nome da receita para a busca: ");
            var nomeReceita = leitura.nextLine();

            String endereco = "" + nomeReceita;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        }
    }

