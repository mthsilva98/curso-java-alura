package desafioex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<Integer> numeroInteiros = new ArrayList<>();
        numeroInteiros.add(23);
        numeroInteiros.add(54);
        numeroInteiros.add(14);

        Collections.sort(numeroInteiros);
        System.out.println(numeroInteiros);



        List<Titulo2> listaTitulo2 = new ArrayList<>();
        listaTitulo2.add(new Titulo2("D"));
        listaTitulo2.add(new Titulo2("A"));
        listaTitulo2.add(new Titulo2("B"));

        Collections.sort(listaTitulo2);

        for (Titulo2 titulo2 : listaTitulo2) {
            System.out.println(titulo2.nome);
        }

    }
}
