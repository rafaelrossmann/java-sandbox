import java.util.Scanner;

public class bibliotecaMath {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o primeiro valor: ");
        double numero01 = entrada.nextDouble();

        System.out.println("\nDigite o segundo valor: ");
        double numero02 = entrada.nextDouble();

        double soma = numero01 + numero02;
        double subtracao = numero01 - numero02;
        double multiplicacao = numero01 * numero02;
        double divisaoReal = numero01 / numero02;
        double divisaoInteira = numero01 / numero02;
        double resto = numero01 % numero02;
        double potencia = Math.pow(numero01, numero02);
        double maior = Math.max(numero01, numero02);
        double menor = Math.min(numero01, numero02);


        System.out.println("A soma destes dois números é: " + soma);
        System.out.println("A subtração destes dois números é: " + subtracao);
        System.out.println("A multiplicação destes dois números é: " + multiplicacao);
        System.out.println("A divisão real destes dois números é: " + divisaoReal);
        System.out.println("A divisão inteira destes dois números é: " + divisaoInteira);
        System.out.println("O resto da divisão inteira destes dois números é: " + resto);
        System.out.println("A potenciação destes dois números é: " + potencia);
        System.out.println("O maior destes dois números é: " + maior);
        System.out.println("O menor destes dois números é: " + menor);

    }
}