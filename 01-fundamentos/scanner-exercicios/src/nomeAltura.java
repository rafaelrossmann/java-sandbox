import java.util.Scanner;

 /* Leia nome e altura e mostre:
    Nome:___ | Altura:___ metros.
 */

public class nomeAltura {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = teclado.nextDouble();

        System.out.printf("Nome: %s | Altura: %.2f", nome, altura);

        teclado.close();

    }
}
