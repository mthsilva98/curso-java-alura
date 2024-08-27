package desafioex4;

public class Titulo2 implements Comparable <Titulo2> {

     String nome;


     public Titulo2(String nome) {
         this.nome = nome;
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo2 outro) {
        return this.nome.compareTo(outro.nome);

    }

}
