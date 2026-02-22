
import java.util.ArrayList;

public class CadastraAluno {
    
    private ArrayList<Aluno> alunos;

    public CadastraAluno(){
        alunos = new ArrayList<>();
    }

    public void CadastraAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void mostrarAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
        }
    }
}