package heranca.ex1;

public class Aluno extends Pessoa {

    private int registroAluno;
    private float notaVestibular;
    private String curso;
    private String dataMatricula;

    public int getRegistroAluno() {
        return registroAluno;
    }

    public void setRegistroAluno(int registroAluno) {
        this.registroAluno = registroAluno;
    }

    public float getNotaVestibular() {
        return notaVestibular;
    }

    public void setNotaVestibular(float notaVestibular) {
        this.notaVestibular = notaVestibular;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String retornaDadosAlunos() {
        String dados;

        dados = super.retornaDados();

        dados += "Registro Aluno: " + this.registroAluno + "\n";
        dados += "Nota vestibular: " + this.notaVestibular + "\n";
        dados += "Curso: " + this.curso + "\n";
        dados += "Data da matrícula: " + this.dataMatricula + "\n";

        return dados;
    }
}
