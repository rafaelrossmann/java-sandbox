import java.util.Scanner;

 /* Leia produto, quantidade e preço e mostre os dados.
 */

public class produtoQuantidadePreco {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = leitor.nextLine();

        System.out.println("Digite a quantidade de produtos: ");
        int quantidadeProduto = leitor.nextInt();

        System.out.println("Digite o preço do produto: ");
        double precoProduto = leitor.nextDouble();
        double precoTotal = precoProduto * quantidadeProduto;

        System.out.printf("\nProduto: %s |\nQuantidade: %d |\nPreço unitário: %.3f |\nPreço total: %.3f", produto, quantidadeProduto, precoProduto, precoTotal);
    }

}
