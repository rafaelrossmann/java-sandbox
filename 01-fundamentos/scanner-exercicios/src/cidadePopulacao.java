import java.util.Scanner;

 /* Leia cidade e número de habitantes e mostre os dados.
 */

public class cidadePopulacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a cidade: ");
        String cidade = entrada.nextLine();

        System.out.println("Digite o número de habitantes: ");
        double numeroHabitantes = entrada.nextDouble();

        System.out.printf("-- Cidade: %s -- | -- Habitantes: %f", cidade, numeroHabitantes);

        entrada.close();
    }
}
