package Ativ1;

import java.util.Scanner;

public class SalarioChico {

    public static void main(String[] args) {

        Scanner salarioBruto = new Scanner(System.in);
        System.out.println("Insira o salário bruto");
        Integer salarioDigitado = salarioBruto.nextInt();
        
        Scanner conducao = new Scanner(System.in);
        System.out.println("Valor da passagem de ida diária");
        Double conducaoDigitada = conducao.nextDouble();

        Double passagem = conducaoDigitada * 2 * 22;
        Double descontos = salarioDigitado * 0.1 + salarioDigitado * 0.2 + 
                passagem;
        
        String resultado = String.format(
                "Seu salário bruto é R$ %d, tem um total de R$ %.2f em "
                        + "descontos e receberá um líquido de R$ %.2f", 
                salarioDigitado,
                descontos,
                salarioDigitado - descontos);
        System.out.println(resultado);
    }

}
