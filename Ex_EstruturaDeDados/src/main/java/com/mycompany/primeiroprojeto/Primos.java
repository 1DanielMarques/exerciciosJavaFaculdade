package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class Primos {

    public static void main(String[] args) {

        int numero, contador = 0, i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = sc.nextInt();

        while (i <= numero) {
            if (numero % i == 0) {
                contador++;
            }
            if (contador > 2) {
                System.out.println("Não é primo");
                break;
            }
            i++;
        }
        if (contador == 2) {
            System.out.println("É primo");
        }

         
        /*
        if (numero == 2) {
            System.out.println("É primo");
        } else { */
            for (int c = 2; i < numero; c++) {
                if (numero % c == 0) {
                    System.out.println(numero + " Não é primo");
                    break;
                } else {
                    System.out.println(numero + " É primo");
                    break;
                }
            }
      //  } 
// Main        
    }
}

/*  int divisores, primo = 0, N;

         for (int cont1 = 1; cont1 <= 100; cont1++) {
            N = cont1;
            divisores = 0;
            for (int cont2 = 1; cont2 <= N; cont2++) {
                if ((N % cont2) == 0) {
                    divisores += 1;
                }
            }
            if (divisores == 2) {
                primo += 1;
                System.out.println(cont1);
            }

        }
        System.out.println("Total de primos: " + primo); */
