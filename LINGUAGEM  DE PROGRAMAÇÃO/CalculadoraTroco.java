
package Ativ1;

import java.util.Scanner;


public class CalculadoraTroco {

    public static void main(String[] args) {
        
        Scanner unidade = new Scanner(System.in);
        System.out.println("Valor unitário do produto");
        Double unidadeDigitado = unidade.nextDouble();
        
        Scanner quantidade = new Scanner(System.in);
        System.out.println("Quantide de produtos");
        Integer quantidadeDigitado = quantidade.nextInt();
        
        Scanner valor = new Scanner(System.in);
        System.out.println("Valor pago pelo cliente");
        Double valorDigitado = valor.nextDouble();
        
        
        Double valorTotal = unidadeDigitado * quantidadeDigitado;
        Double troco = valorDigitado - valorTotal;
        
        String total = String.format("Seu troco será de R$ %.2f", troco);
        System.out.println(total);
    }
    
}
