import java.util.ArrayList;

public class Disciplina {
    public String nome;
    public int carga;
    public ArrayList<Aluno> alunos;
    private Professor professor;
    public ArrayList<String> materias;


    public Disciplina(String nome, int carga, Professor professor, ArrayList<String> materias){
        this.nome = nome;
        this.carga = carga;
        this.alunos = new ArrayList<>();
        this.professor = professor;
        this.materias = materias;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
