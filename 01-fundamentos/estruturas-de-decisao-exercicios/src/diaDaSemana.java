import java.util.Scanner;

public class diaDaSemana {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número correspondente ao dia da semana: ");
        int diaSemana = teclado.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            case 8:
                System.out.println(diaSemana + ": Dia inválido!");
        }
    }
}
