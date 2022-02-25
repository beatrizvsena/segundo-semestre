package Nivelamento2;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Digite um número");
        Integer numDigitado = num.nextInt();

        for (int i = 0; i < 11; i++) {

            Integer tabuadas = numDigitado * i;

            System.out.println(String.format("Tabuada do %d \n "
                    + "%d X %d = %d", numDigitado, numDigitado, i, tabuadas));

        }
    }

}
