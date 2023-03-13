package heranca.ex2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();

        System.out.println("-- Insira os dados do Aluno --\n");
        System.out.print("Insira o nome do aluno: ");
        a1.setNome(sc.nextLine());
        System.out.print("Insira o rg do aluno: ");
        a1.setRg(sc.nextLine());
        System.out.print("Insira o cpf do aluno: ");
        a1.setCpf(sc.nextLine());
        System.out.print("Insira o endereço do aluno: ");
        a1.setEndereco(sc.nextLine());
        System.out.print("Insira a nota do aluno: ");
        a1.setNotaVestibular(sc.nextFloat());
        sc.nextLine();
        System.out.print("Insira o curso do aluno: ");
        a1.setCurso(sc.nextLine());
        System.out.print("Insira a data da matrícula do aluno: ");
        a1.setDataMatricula(sc.nextLine());

        System.out.println("\n-- Insira os dados do Professor --\n");
        System.out.print("Insira o nome do professor: ");
        p1.setNome(sc.nextLine());
        System.out.print("Insira o rg do professor: ");
        p1.setRg(sc.nextLine());
        System.out.print("Insira o cpf do professor: ");
        p1.setCpf(sc.nextLine());
        System.out.print("Insira o endereço do professor: ");
        p1.setEndereco(sc.nextLine());
        System.out.print("Insira o número da matrícula do professor: ");
        p1.setMatriculaProfessor(sc.nextInt());
        System.out.print("Insira a data de admissão do professor: ");
        sc.nextLine();
        p1.setDataAdmissao(sc.nextLine());
        System.out.print("Insira salário hora do professor: ");
        p1.setSalarioHora(sc.nextDouble());

        System.out.println("\n");
        System.out.println("\t - Dados do Aluno RA nº: " + a1.getRegistroAluno() + " - \n");
        System.out.println(a1.retornaDadosAlunos());

        System.out.println("\n");
        System.out.println("\t - Dados do Professor matrícula nº: " + p1.getMatriculaProfessor() + " - \n");
        System.out.println(p1.retornaDadosProfessor());

    }

}
