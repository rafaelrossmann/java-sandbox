import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("\nDigite o nome do produto: ");
        String nomeProduto = teclado.nextLine();

        System.out.println("\nDigite a quantidade: ");
        int quantidade = teclado.nextInt();

        System.out.println("\nDigite o preço: ");
        double preco = teclado.nextDouble();

        System.out.printf("\nProduto: %s - Quantidade: %d - Preço: %.2f", nomeProduto, quantidade, preco);

        teclado.close();

        }
    }