/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ativ1;

import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {

        Scanner login = new Scanner(System.in);
        System.out.println("Digite seu login");
        String loginDigitado = login.nextLine();

        Scanner senha = new Scanner(System.in);
        System.out.println("Digite sua senha");
        String senhaDigitada = senha.nextLine();

        Scanner tentativas = new Scanner(System.in);
        System.out.println("Insira a quantidade de tentativas");
        Integer quantidade = tentativas.nextInt();

   String texto = String.format("Seu login é %s e sua senha é %s . Você tem %d"
             + " tentativas antes de ser bloqueado ", loginDigitado, 
             senhaDigitada, quantidade);
        System.out.println(texto);

    }

}
