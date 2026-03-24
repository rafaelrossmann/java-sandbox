import java.util.Scanner;

public class conversaoTemperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite uma temperatura em Graus Celsius: ");
        double grausCelsius = entrada.nextDouble();

        double grausFahrenheit = grausCelsius * 1.8 + 32;

        System.out.println(grausCelsius + " em Graus Fahrenheit é igual a: " + grausFahrenheit);

    }

}
