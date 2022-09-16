package exAula_dia_1509;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] r;
        System.out.println("Matriz A");
        System.out.print("Linhas: ");
        int linha = sc.nextInt();
        System.out.print("Colunas: ");
        int coluna = sc.nextInt();
        int[][] a = new int[linha][coluna];
        System.out.println("Matriz B");
        System.out.print("Linhas: ");
        linha = sc.nextInt();
        System.out.print("Colunas: ");
        coluna = sc.nextInt();
        int[][] b = new int[linha][coluna];

        System.out.println("Valores de A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Valores de B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print("Linha " + (i + 1) + " Coluna " + (j + 1) + ": ");
                b[i][j] = sc.nextInt();
            }
        }
        if (a[0].length == b.length) {
            r = new int[a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int aux = 0; aux < a[0].length; aux++) {
                        r[i][j] += a[i][aux] * b[aux][j];
                    }
                }
            }

            for (int i = 0; i < r.length; i++) {
                for (int j = 0; j < r[i].length; j++) {
                    System.out.print(r[i][j]+" | ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Não é possível mutliplicar");
        }


        sc.close();


    }
}
