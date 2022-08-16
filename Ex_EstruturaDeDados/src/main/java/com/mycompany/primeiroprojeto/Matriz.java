package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 * @author mDanielSE
 */
public class Matriz {

    public static int m1[][], m2[][], m3[][];
    public static int x1, y1, x2, y2, valor, soma = 0, somaAux = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void informaM1() {
        System.out.println("Valores matriz 1");
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                System.out.print("Valor: ");
                valor = sc.nextInt();
                m1[i][j] = valor;
            }
        }
    }

    public static void escrevaM1() {
        for (int i = 0; i < x1; i++) {
            System.out.println("");
            for (int j = 0; j < y1; j++) {
                System.out.print(m1[i][j]);

            }
        }
    }

    public static void informaM2() {
        System.out.println("\nValores matriz 2");
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                System.out.print("Valor: ");
                valor = sc.nextInt();
                m2[i][j] = valor;
            }
        }
    }

    public static void escrevaM2() {
        for (int i = 0; i < x1; i++) {
            System.out.println("");
            for (int j = 0; j < y1; j++) {
                System.out.print(m2[i][j]);

            }
        }
    }

    public static void soma() {
        m3 = new int[x1][y1];
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }

        }
        System.out.print("\n--SOMA--");
        for (int k = 0; k < m3.length; k++) {
            System.out.println("");
            for (int m = 0; m < m3.length; m++) {
                System.out.print(m3[k][m]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Matriz X: ");
        x1 = sc.nextInt();
        System.out.print("Matriz Y: ");
        y1 = sc.nextInt();
        m1 = new int[x1][y1];
        m2 = new int[x1][y1];
        informaM1();
        System.out.print("----");
        informaM2();
        System.out.print("Matriz 1");
        escrevaM1();
        System.out.print("\nMatriz 2");
        escrevaM2();
        //soma();
        m3 = new int[x1][y1];
        System.out.println("");
        // Multiplicacao das matrizes
        int colunaAux = 0;
        for (int linha = 0; linha < x1; linha++) {

            for (int coluna = 0; coluna < y1; coluna++) {
                somaAux = (m1[linha][coluna]) * (m2[coluna][linha]);
                //
                soma += somaAux;
            }
            System.out.println(soma);
            System.out.println("");
            for (int coluna = 0; coluna < y1; coluna++) {
                somaAux = (m1[linha][coluna]) * (m2[coluna][linha + 1]);
                //
                soma += somaAux;
            }
            System.out.println(soma);
        }
       /* for (int linha = 0; linha < x1; linha++) {
            for (int coluna = 0; coluna < y1; coluna++) {
                System.out.println(m3[linha][coluna]);
            }
        }*/
    }
}
