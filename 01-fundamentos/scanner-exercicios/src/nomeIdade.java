import java.util.Scanner;

 /* Exercício 1. Leia nome e idade e mostre:
    Olá, [nome]! Você tem [idade] anos.
 */

public class nomeIdade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("\nDigite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("\nOlá, %s! Você tem %s anos.", nome, idade);

        entrada.close();

        }
    }