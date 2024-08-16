package Exercicios;

public class Teste {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: top Gun: Maverick");


        int ano = 2022;
        String nome = "Matheus";
        double notaFilme = 5.4;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galâ dos anos 80
                Muito bom!
                Ano de lançamento
                """ + ano;

        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);





    }
}
