import java.util.Scanner;

public class sistemaMediaAcademica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String aluno = entrada.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("=== Escolha a opção desejada ===" +
                "\n1 - Média simples " +
                "\n2 - Média ponderada " +
                "\n3 - Maior nota");
        int opcao = entrada.nextInt();

        if (opcao >= 7) {
            String situacao = "Aprovado!";
        } else if (opcao >= 5) {
            String situacao = "Recuperação!";
        } else {
            String situacao = "Reprovado!";
        }

        switch (opcao) {
            case 1:
                double situacao1 = (nota1 + nota2) / 2;
                if (situacao1 >= 7) {
                    System.out.println("Aluno: " + aluno +
                            "\nMédia simples: " + situacao1 +
                            "\nSituação: Aprovado!");
                } else if (situacao1 >= 5) {
                    System.out.println("Aluno: " + aluno +
                            "\nMédia simples: " + situacao1 +
                            "\nSituação: Recuperação!");
                } else {
                    System.out.println("Aluno: " + aluno +
                            "\nMédia simples: " + situacao1 +
                            "\nSituação: Reprovado!");
                }
                break;
            case 2:
                double situacao2 = (nota1 + nota2) / 2;
                if (situacao2 >= 7) {
                    System.out.println("Aluno: " + aluno +
                            "\nMédia simples: " + situacao2 +
                            "\nSituação: Aprovado!");
                } else if (situacao2 >= 5) {
                    System.out.println("Aluno: " + aluno +
                            "\nMédia simples: " + situacao2 +
                            "\nSituação: Recuperação!");
                } else {
                    System.out.println("Aluno: " + aluno +
                            "\nMédia simples: " + situacao2 +
                            "\nSituação: Reprovado!");
                }
                break;
            case 3:
                System.out.println("Aluno: " + aluno +
                        "\nMaior nota: " + Math.max(nota1, nota2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}
