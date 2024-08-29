import java.util.Scanner;
public class Main{
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option = 0;

        Professor professor1 = new Professor("Bob", 4500, "Matemática");


        System.out.println("Bem vindo ao sistema de turmas!");
        while (true) {
            System.out.println("Escolha a opção que deseja:\n1 - Matricular um aluno\n2 - Listar alunos de uma disciplina\n3 - Mostrar informações de uma disciplina\n4 - Listar disciplinas\n5 - Mostrar informações do aluno por matrícula\n6 - Alterar informações de um aluno\n0 - Sair");
            option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1:
                    System.out.println("Digite o nome do aluno a ser cadastrado: ");
                    String aluno = sc.nextLine();
                    System.out.println("Digite a disciplina para matricular o aluno:");
                    for (int i = 0; i < dis)
            }

        }
    }
}