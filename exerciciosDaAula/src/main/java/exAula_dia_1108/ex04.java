package exAula_dia_1108;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano, resultado;
        System.out.println("Informe um ano");
        ano = sc.nextInt();

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            System.out.println("Ano bissexto");
        }else{
            System.out.println("Ano NÃO bissexto");
        }

    }
}
