package com.mycompany.primeiroprojeto.Testes;

import java.util.Scanner;

/**
 *
 * @author mDanielSE
 */
public class Teste1 {

    public static void main(String[] args) {
        /* 
        Programa em Java que lê número inteiro,
        calcula seu dobro e mostre o resultado
         */
        int numero;
        int resultado;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        numero = sc.nextInt();
        numero = numero * 2;
        System.out.println("Número: " + numero);
        System.out.println("-----------------------------------");
        
        // Código 2
        double a = 3.14159;
        double b = 2.71828;
        double c;
        
        c = b; 
        b = a; 
        a = c;
        
        System.out.println("\nPI = %f" + b);
        System.out.println("\nEULER = &f " + a);
        
        
        
        
        

    }

}
