import java.util.Scanner;

 /* Leia nome, idade e curso e mostre as informações.
 */

public class dadosAluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String aluno = teclado.nextLine();

        System.out.println("Idade do aluno: ");
        int idade = teclado.nextInt();
        teclado.nextLine(); // limpeza do buffer do teclado!

        System.out.println("Curso do aluno: ");
        String curso = teclado.nextLine();

        System.out.printf("\n Aluno: %s \n Idade: %d \n Curso: %s", aluno, idade, curso);

        teclado.close();
    }
}
