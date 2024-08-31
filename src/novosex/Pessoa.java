package novosex;

public record Pessoa(String nome, int idade, String cidade) {

    @Override
    public String toString() {
       return "Nome: " + nome + " Idade: " + idade + " Cidade: " + cidade;
    }
}
