package Ativ1;

import java.util.Scanner;

public class Chico {

    public static void main(String[] args) {

        Scanner nome  = new Scanner(System.in);
        System.out.println("Seu nome");
        String nomeDigitado = nome.nextLine();
        
        Scanner aquecimento = new Scanner(System.in);
        System.out.println("Quantidade de tempos de aquecimento (minutos");
        Integer aquecimentoDigitado = aquecimento.nextInt();

        Scanner aerobico = new Scanner(System.in);
        System.out.println("Quantidade de tempos de aeróbico (minutos");
        Integer aerobicoDigitado = aerobico.nextInt();

        Scanner musculacao = new Scanner(System.in);
        System.out.println("Quantidade de tempos de muculação (minutos");
        Integer musculacaoDigitado = musculacao.nextInt();

        Integer calAquecimento = aquecimentoDigitado * 12;
        Integer calAerobico = aerobicoDigitado * 20;
        Integer calMusculacao = musculacaoDigitado * 25;

        Integer totalTempo = aquecimentoDigitado + aerobicoDigitado 
                + musculacaoDigitado;
        Integer totalCalorias = calAquecimento + calAerobico + calMusculacao;
        
        String frase = String.format("Olá, %s. Você fez um total de %d minutos "
                + "de exercícios e perdeu cerca de %d calorias ", nomeDigitado,
                totalTempo, totalCalorias);
        System.out.println(frase);
    }

}
