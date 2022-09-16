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

        System.out.println("Matriz B");
        System.out.print("Linhas:  ");
        linha = sc.nextInt();
        System.out.print("Colunas:  ");
        coluna = sc.nextInt();
        sc.close();

    }
}
