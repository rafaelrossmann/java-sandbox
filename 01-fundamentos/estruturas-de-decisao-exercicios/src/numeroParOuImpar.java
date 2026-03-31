// Leia um número inteiro e informe se ele é par ou ímpar.

import java.util.Scanner;

public class numeroParOuImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0){
            System.out.println("Esse número é PAR!");
        } else {
            System.out.println("Esse número é IMPAR!");
        }
    }

}
