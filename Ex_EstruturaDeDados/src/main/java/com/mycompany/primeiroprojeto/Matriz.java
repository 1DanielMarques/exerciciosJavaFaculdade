package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class Matriz {

    public static int m1[][], m2[][], m3[][];
    public static int linhaA, colunaA, linhaB, colunaB, valor, soma = 0, somaAux = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void informaM1() {
        System.out.println("Valores matriz A");
        for (int i = 0; i < linhaA; i++) {
            for (int j = 0; j < colunaA; j++) {
                System.out.print("Valor: ");
                valor = sc.nextInt();
                m1[i][j] = valor;
            }
        }
    }

    public static void escrevaM1() {
        for (int i = 0; i < linhaA; i++) {
            System.out.println("");
            for (int j = 0; j < colunaA; j++) {
                System.out.print(m1[i][j] + " ");

            }
        }
    }

    public static void informaM2() {
        System.out.println("\nValores matriz B");
        for (int i = 0; i < linhaB; i++) {
            for (int j = 0; j < colunaB; j++) {
                System.out.print("Valor: ");
                valor = sc.nextInt();
                m2[i][j] = valor;
            }
        }
    }

    public static void escrevaM2() {
        for (int i = 0; i < linhaB; i++) {
            System.out.println("");
            for (int j = 0; j < colunaB; j++) {
                System.out.print(m2[i][j] + " ");

            }
        }
    }

    public static void escrevaM3() {
        for (int i = 0; i < linhaA; i++) {
            System.out.println("");
            for (int j = 0; j < colunaB; j++) {
                System.out.print(m3[i][j] + " ");

            }
        }
    }

    public static void soma() {
        m3 = new int[linhaA][colunaA];
        for (int i = 0; i < linhaA; i++) {
            for (int j = 0; j < colunaA; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
    }

    public static void multiplicacao() {
        m3 = new int[linhaA][colunaB];
        for (int i = 0; i < linhaA; i++) {
            for (int j = 0; j < colunaB; j++) {
                for (int k = 0; k < linhaB; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        System.out.print("Matriz X: ");
        linhaA = sc.nextInt();
        System.out.print("Matriz Y: ");
        colunaA = sc.nextInt();
        m1 = new int[linhaA][colunaA];
        linhaB = linhaA;
        colunaB = colunaA;
        m2 = new int[linhaB][colunaB];
        informaM1();
        System.out.print("----");
        informaM2();
        System.out.print("Matriz 1");
        escrevaM1();
        System.out.print("\nMatriz 2");
        escrevaM2();
        do {
            System.out.println("\n1 - Somar");
            System.out.println("2 - Multiplicar");
            System.out.println("9 - Finalizar");
            opcao = sc.nextInt();
            if (opcao == 1) {
                soma();
                System.out.print("\n--SOMA--");
                escrevaM3();
            } else if (opcao == 2) {
                multiplicacao();
                System.out.print("\n--MULTIPLICACAO--");
                escrevaM3();
            }
        } while (opcao != 9);
    }
}
