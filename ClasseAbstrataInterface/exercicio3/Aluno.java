public class Aluno implements Comparable{
    private double nota;
    private String nome;
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
    public Aluno(String nome, double nota) {
        this.nota = nota;
        this.nome = nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
}