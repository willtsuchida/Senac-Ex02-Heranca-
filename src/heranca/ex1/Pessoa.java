package heranca.ex1;

public class Pessoa {

    String nome;
    String rg;
    String cpf;

    public String retornaDados() {
        String dados = "";

        dados += "Nome: " + nome + "\n";
        dados += "RG: " + rg + "\n";
        dados += "CPF: " + cpf + "\n";

        return dados;
    }
}
