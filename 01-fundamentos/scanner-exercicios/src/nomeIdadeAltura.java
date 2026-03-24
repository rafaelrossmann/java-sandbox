import java.util.Scanner;

 /* Leia nome, idade e altura e mostre tudo em uma linha.
 */

public class nomeIdadeAltura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite sua altura: ");
        float altura = entrada.nextFloat();

        System.out.printf("Nome: %s | Idade: %d anos | Altura: %.2f metros", nome, idade, altura);

        entrada.close();

    }
}
