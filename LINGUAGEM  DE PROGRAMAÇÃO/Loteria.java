package Nivelamento2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner numeroDigitado = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10");
        Integer numero = numeroDigitado.nextInt();

        Integer sorteio = ThreadLocalRandom.current().nextInt(1, 10);

        int i = 0;

        while (i < sorteio) {
            //System.out.println(numero);
            if (sorteio == numeroDigitado.nextInt()) {
        System.out.println(String.format("O número sorteado era: %d", sorteio));

                switch (sorteio) {
                    case 1,2,3:
                        System.out.println("Vc é  sortudo");
                        break;

                    case 4,5,6,7,8,9:
                        System.out.println("Vc é muito sortudo");
                        break;
                    case 10:
        System.out.println("É melhor você parar de apostar e ir trabalhar");
                        break;
                    default:                
                }
                
            } else {
                System.out.println("Tente Novamente");
            }

        }
    }
    
}
