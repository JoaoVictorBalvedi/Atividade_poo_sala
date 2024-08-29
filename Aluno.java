public class Aluno {
    public int matricula;
    public String nome;
    public int idade;


    public Aluno(int matricula, String nome, int idade){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}
