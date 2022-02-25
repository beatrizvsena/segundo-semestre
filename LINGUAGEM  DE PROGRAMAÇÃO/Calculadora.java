package Ativ1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Digite um número");
        Integer numero1Digitado = numero1.nextInt();

        Scanner numero2 = new Scanner(System.in);
        System.out.println("Digite outro número");
        Integer numero2Digitado = numero2.nextInt();

        String resultados = String.format("Resultado da soma: %d "
                + "\nResultado subtração: %d "
                + "\nResultado da multiplicação: %d "
                + "\nResultado da divisão: %d",
                numero1Digitado + numero2Digitado,
                numero1Digitado - numero2Digitado,
                numero1Digitado * numero2Digitado,
                numero1Digitado / numero2Digitado);
        System.out.println(resultados);
    }

}
