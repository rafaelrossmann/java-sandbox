/* Leia a nota de um aluno e informe o conceito conforme a tabela: nota maior ou igual a 9 → Conceito
A; nota maior ou igual a 7 → Conceito B; nota maior ou igual a 5 → Conceito C; caso contrário →
Reprovado.
*/
import java.util.Scanner;

public class conceitoNotaAluno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double notaAluno = teclado.nextDouble();

        if (notaAluno >= 9){
            System.out.println("Conceito A");
        } else if(notaAluno >= 7){
            System.out.println("Conceito B");
        } else if (notaAluno >= 5){
            System.out.println("Conceito C");
        } else {
            System.out.println("Aluno Reprovado");
        }


    }
}
