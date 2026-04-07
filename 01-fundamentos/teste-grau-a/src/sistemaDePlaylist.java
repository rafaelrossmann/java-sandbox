import java.util.Scanner;

public class sistemaDePlaylist {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da música: ");
        String musica = entrada.nextLine();

        System.out.println("Digite o nome do artista: ");
        String artista = entrada.nextLine();

        System.out.println("Digite a duração da música: ");
        double duracaoMusica = entrada.nextDouble();

        System.out.println("Digite a sua nota para essa música: ");
        double notaMusica = entrada.nextDouble();

        System.out.println("\nMúsica: " + musica + "\nArtista: " + artista);

        if (duracaoMusica <= 3) {
            System.out.println("Duração: " + duracaoMusica + " minutos (Curta)");
        } else if (duracaoMusica <= 6) {
            System.out.println("Duração: " + duracaoMusica + " minutos (Média)");
        } else {
            System.out.println("Duração: " + duracaoMusica + " minutos (Longa)");
        }

        if (notaMusica >= 9) {
            System.out.println("Avaliação: Favorita");
        } else if (notaMusica >= 7) {
            System.out.println("Avaliação: Boa");
        } else if (notaMusica >= 5) {
            System.out.println("Avaliação: Regular");
        } else if (notaMusica < 5) {
            System.out.println("Avaliação: Ruim");
        } else {
            System.out.println("Nota inválida!");
        }

    }
}