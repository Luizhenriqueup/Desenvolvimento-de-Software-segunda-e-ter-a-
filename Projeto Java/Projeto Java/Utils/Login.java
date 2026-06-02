package Utils;

import java.util.Scanner;

public class Login {

    public void exibirLogin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LOGIN ===");

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        System.out.println("Bem-vindo, " + usuario);
    }
}