package Ativ1;

import java.util.Scanner;

public class Quisito {

    public static void main(String[] args) {

        Scanner filhos03 = new Scanner(System.in);
        System.out.println("Quantidade de filhos de 0 a 3 anos");
        Integer filhosZeroATres = filhos03.nextInt();
        
        Scanner filhos416 = new Scanner(System.in);
        System.out.println("Quantidade de filhos de 4 a 16 anos");
        Integer filhosQuatroADeze = filhos416.nextInt();
        
        Scanner filhos1718 = new Scanner(System.in);
        System.out.println("Quantidade de filhos de 17 a 18 anos");
        Integer filhosDezesADezo = filhos1718.nextInt();
        
        
        Double bolsa4 = filhosZeroATres * 24.12;
        Double bolsa16 = filhosQuatroADeze * 15.88;
        Double bolsa18 = filhosDezesADezo * 12.44;
        
Integer filhosTotal = filhosZeroATres + filhosQuatroADeze + filhosDezesADezo;
Double bolsaTotal = bolsa4 + bolsa16 + bolsa18;
        
if (filhosZeroATres > 0 || filhosQuatroADeze > 0 || filhosDezesADezo > 0 ) {
String frase = String.format("Você tem um total de %d filhos e vai "
+ "receber R$ %.2f de bolsa", filhosTotal, bolsaTotal);
System.out.println(frase);
}else {
System.out.println("Você não tem bolsa a receber");
        }
        
        
        
        }

    }

