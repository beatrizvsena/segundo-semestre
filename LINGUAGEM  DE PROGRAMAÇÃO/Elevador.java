package Ativ1;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {

        Scanner peso = new Scanner(System.in);
        System.out.println("Insira o limite de peso do elevador");
        Double pesoDigitado = peso.nextDouble();

        Scanner pessoas = new Scanner(System.in);
        System.out.println("Insira o limite de pessoas do elevador");
        Integer pessoasDigitado = pessoas.nextInt();

        Scanner pessoa1 = new Scanner(System.in);
        System.out.println("Peso da 1º pessoa");
        Double pessoa1Peso = pessoa1.nextDouble();

        Scanner pessoa2 = new Scanner(System.in);
        System.out.println("Peso da 2º pessoa");
        Double pessoa2Peso = pessoa2.nextDouble();

        Scanner pessoa3 = new Scanner(System.in);
        System.out.println("Peso da 3º pessoa");
        Double pessoa3Peso = pessoa3.nextDouble();

        String total = String.format("Entraram 3 pessoas no elevador, "
                + "no qual cabem %d pessoas.\n"
                + "O peso total no elevador é de %d, sendo que ele suporta %.2f",
                pessoasDigitado,
                pessoa1Peso + pessoa2Peso + pessoa3Peso,
                pesoDigitado
                );
        System.out.println(total);
    }
}
