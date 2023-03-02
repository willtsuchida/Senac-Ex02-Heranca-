package heranca.ex1;

public class Pessoa {

    private String nome;
    private String rg;
    private String cpf;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String retornaDados() {
        String dados = "";

        dados += "Nome: " + this.nome + "\n";
        dados += "RG: " + this.rg + "\n";
        dados += "CPF: " + this.cpf + "\n";
        dados += "Endereço: " + this.endereco + "\n";

        return dados;
    }
}
