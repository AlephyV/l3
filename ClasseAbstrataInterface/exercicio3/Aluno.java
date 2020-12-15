
package ex3;


public class Aluno implements Comparable{
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public int compareTo(Object a) {
        Aluno aluno = (Aluno) a;
        if(this.nota > aluno.getNota()) {
            return -1;
        } else if(this.nota == aluno.getNota()) {
            return 0;
        } else {
            return 1;
        }
    }
}
