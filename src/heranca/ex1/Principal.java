package heranca.ex1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        String nome, rg, cpf, endereco, curso, dataMatricula;
        int registroAluno;
        float notaVestibular;
        
        
        System.out.print("Insira o nome do aluno: ");
        nome = sc.nextLine();
        a1.setNome(nome);
        System.out.print("Insira o rg do aluno: ");
        rg = sc.nextLine();
        a1.setRg(rg);
        System.out.print("Insira o cpf do aluno: ");
        cpf = sc.nextLine();
        a1.setCpf(cpf);
        System.out.print("Insira o endereço do aluno: ");
        endereco = sc.nextLine();
        a1.setEndereco(endereco);        
        System.out.print("Insira o número de registro do aluno: ");
        registroAluno = sc.nextInt();
        a1.setRegistroAluno(registroAluno);
        System.out.print("Insira a nota do aluno: ");
        notaVestibular = sc.nextFloat();
        a1.setNotaVestibular(notaVestibular);
        sc.nextLine();
        System.out.print("Insira o curso do aluno: ");
        curso = sc.nextLine();
        a1.setCurso(curso);
        System.out.print("Insira a data da matrícula do aluno: ");
        dataMatricula = sc.nextLine();
        a1.setDataMatricula(dataMatricula);
        /*
        System.out.print("Insira o nome do professor: ");
        p1.nome = sc.nextLine();
        System.out.print("Insira o rg do professor: ");
        p1.rg = sc.nextLine();
        System.out.print("Insira o cpf do professor: ");
        p1.cpf = sc.nextLine();
        System.out.print("Insira o número da matrícula do professor: ");
        p1.matriculaProfessor = sc.nextInt();
        System.out.print("Insira a data de admissao do professor: ");
        sc.nextLine();
        p1.dataAdmissao = sc.nextLine();
        System.out.print("Insira salário/valor por hora do professor: ");
        p1.salarioHora = sc.nextDouble();
*/
        System.out.println("\n");
        System.out.println("\t - Dados do Aluno RA nº: " + a1.getRegistroAluno() + " - \n");        
        System.out.println(a1.retornaDadosAlunos());

     /*   System.out.println("\n");
        System.out.println("\t - Dados do Professor matricula nº: " + p1.matriculaProfessor + " - \n");
        System.out.println(p1.retornaDadosProfessor());
       */

    }

}
