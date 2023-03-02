package heranca.ex1;

public class Professor extends Pessoa {

    private int matriculaProfessor;
    private String dataAdmissao;
    private double salarioHora;

    public int getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(int matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public String retornaDadosProfessor() {

        String dados;

        dados = super.retornaDados();

        dados += "Matricula: " + this.matriculaProfessor + "\n";
        dados += "Data da admissão: " + this.dataAdmissao + "\n";
        dados += "Salario por hora: " + this.salarioHora + "\n";

        return dados;
    }
}
