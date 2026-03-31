import java.util.Scanner;

public class usuarioESenha {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Usuário: ");
        String usuario = teclado.nextLine();

        System.out.println("Senha: ");
        int senha = teclado.nextInt();

        if(usuario.equals("admin") && senha == 1234){
            System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println("Usuário ou Senha incorreto!");
        }
    }
}
