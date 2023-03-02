package heranca.ex1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        System.out.print("Insira o nome do aluno: ");
        a1.nome = sc.nextLine();
        System.out.print("Insira o rg do aluno: ");
        a1.rg = sc.nextLine();
        System.out.print("Insira o cpf do aluno: ");
        a1.cpf = sc.nextLine();
        System.out.print("Insira o número de registro do aluno: ");
        a1.registroAluno = sc.nextInt();
        System.out.print("Insira a nota do aluno: ");
        a1.notaVestibular = sc.nextFloat();
        sc.nextLine();
        System.out.print("Insira o curso do aluno: ");
        a1.curso = sc.nextLine();
        System.out.print("Insira a data da matrícula do aluno: ");
        a1.dataMatricula = sc.nextLine();

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

        System.out.println("\n");
        System.out.println("\t - Dados do Aluno RA nº: " + a1.registroAluno + " - \n");        
        System.out.println(a1.retornaDadosAlunos());

        System.out.println("\n");
        System.out.println("\t - Dados do Professor matricula nº: " + p1.matriculaProfessor + " - \n");
        System.out.println(p1.retornaDadosProfessor());
       

    }

}
