
package ex3;

import java.util.Scanner;


public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();
        String escolha = "s";
        
        while(escolha.equals("s")) {
            System.out.println("Digite o nome do aluno (sem espaço): ");
            String nome = sc.next();
            
            System.out.println("Digite a nota do " + nome + ": ");
            double nota = sc.nextDouble();
            
            Aluno aluno = new Aluno(nome, nota);
            disciplina.addAluno(aluno);
            
            System.out.println("Quer continuar? [s/n]:");
            escolha = sc.next();
            
        }
        
        disciplina.ordenar();
        disciplina.listarAlunos();
    }
}
