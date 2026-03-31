// Leia a nota de um aluno e informe se ele está aprovado (nota maior ou igual a 7) ou reprovado.

import java.util.Scanner;

public class notaAluno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        int nota = teclado.nextInt();

        if (nota >= 7){
            System.out.println("Parabéns! Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado!");
        }

    }
}
