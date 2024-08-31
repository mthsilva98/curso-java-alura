package novosex;

import com.google.gson.Gson;

public class TestePessoa {
    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Obejeto Pessoa em json: " + jsonPessoa);
        System.out.println("Objeto pessoa desserializado com toString: " + pessoa);

    }
}
