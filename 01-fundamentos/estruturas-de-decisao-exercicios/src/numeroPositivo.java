// Leia um número inteiro e informe se ele é positivo.

import java.util.Scanner;

public class numeroPositivo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        if (numero >= 0){
            System.out.println(numero + " é positivo!");
        } else {
            System.out.println(numero + " não é positivo!");
        }

        }
    }