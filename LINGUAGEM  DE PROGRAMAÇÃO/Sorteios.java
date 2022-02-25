package Nivelamento2;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteios {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 100");
        Integer numeroDigitado = numero.nextInt();

        Random sorteio = new Random();
       // int valor = sorteio.nextInt(30);

        for (int i = 0; i < 200; i++) {

          //  int pares = sorteio.nextInt() % 2 == 0;
           // int impares = sorteio % 2 != 0;

            System.out.println(sorteio.nextInt(100));

            if (sorteio.nextInt() == numero.nextInt()) {
           System.out.println(String.format("Seu número foi no sorteio %d", i));
            }

          System.out.println(String.format("Números pares: %d "
                  + "\n Números impares: %d"));
        }

    }
}

