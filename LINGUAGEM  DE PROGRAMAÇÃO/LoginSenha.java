package Nivelamento2;

import java.util.Scanner;

public class LoginSenha {

    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);
        System.out.println("Digite seu login");
        String loginDigitado = login.nextLine();

        Scanner senha = new Scanner(System.in);
        System.out.println("Digite sua senha");
        String senhaDigitada = senha.nextLine();

        String loginCerto = "admin";
        String senhaCerta = "bandtec";

        String i = login.nextLine();

        while (login.nextLine().equals(loginCerto) 
                && senha.nextLine().equals(senhaCerta)) {

            System.out.println("Login realizado com sucesso");
            break;

        } //else {
        // System.out.println(login);
        System.out.println("Login e ou senha inválidos");

    }

}
