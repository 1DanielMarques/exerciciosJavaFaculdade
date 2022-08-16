package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class Tabuada {

    public static void main(String[] args) {

        int repeticoes, i = 1, n, tabuada;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        repeticoes = sc.nextInt();
        
        System.out.println("TABUADA DO NÚMERO 5");
        System.out.println("-----WHILE-----");
        
        while (i <= repeticoes) {
           /* tabuada = 0;
            tabuada = 5 * i; */
            System.out.println(i + " X 5 = " + (5*i));
            i++;
        }
        /* while (i <= repeticoes) {
            tabuada = 0;
            tabuada = n * i;
            System.out.println(tabuada);
            i++;
        } */

        System.out.println("-----FOR-----");
        for (int c = 1; c <= repeticoes; c++) {
            tabuada = 0;
            tabuada = c * 5;
            System.out.println(c + " X 5 = " + tabuada);
            
        }

    }

}
