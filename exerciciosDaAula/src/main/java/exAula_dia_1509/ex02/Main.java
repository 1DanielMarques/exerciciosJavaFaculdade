package exAula_dia_1509.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz A");
        System.out.print("Linhas:  ");
        int linha = sc.nextInt();
        System.out.print("Colunas:  ");
        int coluna = sc.nextInt();
        int[][] a = new int[linha][coluna];
        System.out.println("Matriz B");
        System.out.print("Linhas:  ");
        linha = sc.nextInt();
        System.out.print("Colunas:  ");
        coluna = sc.nextInt();
        int[][] b = new int[linha][coluna];
        if (a.length == b.length && a[0].length == b[0].length) {
            System.out.println("\nPossível somar/subtrair");
            System.out.println("Linhas A: " + a.length);
            System.out.println("Colunas A: " + a[0].length);
            System.out.println("Linhas B: " + b.length);
            System.out.println("Colunas B: " + b[0].length);
        } else if (a[0].length == b.length) {
            System.out.println("\nPossível multiplicar");
            System.out.println("Linhas A: " + a.length);
            System.out.println("Colunas A: " + a[0].length);
            System.out.println("Linhas B: " + b.length);
            System.out.println("Colunas B: " + b[0].length);
        }


        sc.close();

    }
}
