
package ex3;

import java.util.ArrayList;
import java.util.Collections;

public class Disciplina {
    public ArrayList<Aluno> lista = new ArrayList();
    
    public void addAluno(Aluno aluno) {
        this.lista.add(aluno);
    }

    public void removerAluno(String nome) {
        for(int i = 0; i < this.lista.size(); i++){
            Aluno a = (Aluno) this.lista.get(i);
            if(a.getNome().equals(nome)) {
                this.lista.remove(i);
            }
        }
    }
    
    public void listarAlunos() {
        for(int i = 0; i < this.lista.size(); i++) {
            Aluno a = (Aluno) this.lista.get(i);
            System.out.println(a.getNome() + " - " + a.getNota());
        }
    }
    
    public void ordenar() {
        Collections.sort(this.lista); 
    }
    
}
