package heranca.ex1;

public class Professor extends Pessoa {

    private int matriculaProfessor;
    private String dataAdmissao;
    private double salarioHora;

    public String retornaDadosProfessor() {
        String dados;

        dados = super.retornaDados();

        dados += "Matricula: " + this.matriculaProfessor + "\n";
        dados += "Data da admissão: " + this.dataAdmissao + "\n";
        dados += "Salario por hora: " + this.salarioHora + "\n";

        return dados;
    }
}
