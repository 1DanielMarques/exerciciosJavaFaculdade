package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author mDanielSE
 */
public class Fibonacci {

    public static void main(String[] args) {
        int numero, aAnterior = 0, anterior = 1, atual = 0, i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número");
        numero = sc.nextInt();

        aAnterior = 0;
        anterior = 1;
        atual = aAnterior + anterior;
        if (numero == 0 || numero == 1) {
            System.out.println("Resultado: " + numero);
        } else {
            System.out.println("Resultado: 0");
            //  System.out.println("Resultado: 1"); 
            // Com i começando de 2
            while (i <= numero) {
                atual = aAnterior + anterior;
                aAnterior = anterior;
                System.out.println("Resultado: " + anterior);
                anterior = atual;
                // Com i começando de 2
                // System.out.println("Resultado: " + atual);
                i++;

            }
        }
        /* if (numero == 0 || numero == 1) {
            System.out.println("Resultado: " + numero);
        } else {
            while (i <= numero) {
                atual = aAnterior + anterior;
                aAnterior = anterior;
                anterior = atual;
                i++;
            }
            System.out.println("Resultado: " + atual);
        } */

    }

}
