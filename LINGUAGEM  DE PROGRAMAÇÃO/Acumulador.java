/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nivelamento2;

import java.util.Scanner;

/**
 *
 * @author bvsena
 */
public class Acumulador {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número");
        Integer numeroDigitado = numero.nextInt();

        int soma = 0;
        Integer i = numeroDigitado;

        while (i != 0) {            
            i = numero.nextInt();
            soma++;
        }
            
        
        System.out.println(String.format("A soma dos números foi: %d ", soma));

        
        }

    }


