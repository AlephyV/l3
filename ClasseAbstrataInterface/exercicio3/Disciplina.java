import java.util.ArrayList;
import java.util.Collections;
public class Disciplina {
    public ArrayList<Aluno> lista_alunos = new ArrayList();
    public void addAluno(Aluno aluno) {
        this.lista_alunos.add(aluno);
    }
    public void ordenar() {
        Collections.sort(this.lista_alunos); 
    }
    public void listarAlunos() {
        for(int i = 0; i < this.lista_alunos.size(); i++) {
            Aluno a = (Aluno) this.lista_alunos.get(i);
            System.out.println(a.getNome() + " - " + a.getNota());
        }
    }
    public void removerAluno(String nome) {
        for(int i = 0; i < this.lista_alunos.size(); i++){
            Aluno a = (Aluno) this.lista_alunos.get(i);
            if(a.getNome().equals(nome)) {
                this.lista_alunos.remove(i);
            }
        }
    }
}