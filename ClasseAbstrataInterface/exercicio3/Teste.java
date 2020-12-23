import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();
        String opcao = "s";
        while(opcao.equals("s")) {
            System.out.println("Nome: ");
            String nome = teclado.next();
            System.out.println("Nota: ");
            double nota = teclado.nextDouble();
            Aluno aluno = new Aluno(nome, nota);
            disciplina.addAluno(aluno);
            System.out.println("Continuar? [s/n]:");
            opcao = teclado.next();
        }
        disciplina.ordenar();
        disciplina.listarAlunos();
    }
}