package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class Vetores {

    public static void main(String[] args) {
        int vetor[] = new int[5];
        //int [] vetor = new int[5];
        int[] vetor2;
        int tamanho, aux, verifica = 1, opcao;
        /* System.out.println("Valores do vetor: "); */
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor");
        tamanho = sc.nextInt();
        vetor2 = new int[tamanho];
        System.out.println("Números:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextInt();
        }

        System.out.println("1 - Ordem Crescente");
        System.out.println("2 - Ordem Decrescente");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                while (verifica == 1) {
                    verifica = 0;
                    for (int i = 0; i <= (tamanho - 2); i++) {
                        if (vetor2[i] > vetor2[i + 1]) {
                            verifica = 1;
                            aux = vetor2[i];
                            vetor2[i] = vetor2[i + 1];
                            vetor2[i + 1] = aux;
                        }
                    }
                }
                System.out.println("---ORDEM CRESCENTE---");
                for (int i = 0; i < tamanho; i++) {
                    System.out.print(vetor2[i] + " | ");
                }
                System.out.println("\n---------------------");
                break;
            case 2:
                while (verifica == 1) {
                    verifica = 0;
                    for (int i = tamanho - 1; i > 0; i--) {
                        if (vetor2[i] > vetor2[i - 1]) {
                            verifica = 1;
                            aux = vetor2[i];
                            vetor2[i] = vetor2[i - 1];
                            vetor2[i - 1] = aux;
                        }
                    }
                }
                System.out.println("---ORDEM DECRESCENTE---");
                for (int i = 0; i < tamanho; i++) {
                    System.out.print(vetor2[i] + " | ");
                }
                System.out.println("\n-----------------------");
                break;
        }
    }
}
