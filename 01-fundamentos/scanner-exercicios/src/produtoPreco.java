import java.util.Scanner;

/* Leia nome do produto e preço e mostre:
   Produto:___ | Preço:___
 */

public class produtoPreco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = entrada.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = entrada.nextDouble();

        System.out.printf("Produto: %s | Preço: %.3f", produto, preco);

        entrada.close();

    }

}
