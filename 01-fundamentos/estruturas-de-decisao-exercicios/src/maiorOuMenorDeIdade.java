// Leia a idade de uma pessoa e informe se ela é maior de idade ou menor de idade.

import java.util.Scanner;

public class maiorOuMenorDeIdade {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

    }

}
