package heranca.ex1;

public class Aluno extends Pessoa {

    int registroAluno;
    float notaVestibular;
    String curso;
    String dataMatricula;

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
