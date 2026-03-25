import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        while (nota1 < 0 || nota1 > 10){
            System.out.println("\nErro!! Valor incorreto, tente novamente! ");
            System.out.println("\nDigite a primeira nota (entre 0 e 10): ");
            nota1 = leitor.nextDouble();
        }

        System.out.println("\n Nota registrada com sucesso: " + nota1);
        System.out.println("\n Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        while (nota2 < 0 || nota2 > 10){
            System.out.println("\nErro!! Valor incorreto, tente novamente! ");
            System.out.println("\nDigite a segunda nota (entre 0 e 10): ");
            nota2 = leitor.nextDouble();
        }

        System.out.println("\nNota registrada com sucesso: " + nota2);

        double mediaInicial = (nota1 + nota2) / 2;

        if (mediaInicial >= 6) {
            System.out.println("\n| --- Aluno APROVADO! --- |");
        } else{
            System.out.println("\n| -- Aluno em RECUPERAÇÃO -- |");

            System.out.println("\nDigite a nota da recuperação: ");
            double notaRecuperacao = leitor.nextDouble();

            while (notaRecuperacao < 0 || notaRecuperacao > 10){
                System.out.println("\nErro!! Valor incorreto, tente novamente! ");
                System.out.println("\nDigite a nota de recuperação nota (entre 0 e 10): ");
                notaRecuperacao = leitor.nextDouble();
            }

            System.out.println("\nNota registrada com sucesso: " + notaRecuperacao);

            double mediaFinal = (mediaInicial + notaRecuperacao) / 2;

            if (mediaFinal >= 6) {
                System.out.println("\n| --- Aluno APROVADO! --- |");
            } else{
                System.out.println("\n| - Aluno REPROVADO! - |");
            }
        }

        leitor.close();

        }
    }