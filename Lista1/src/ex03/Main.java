package ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pao, broa;
        double valor;
        double poupanca;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos pães foram vendidos hoje? ");
        pao = sc.nextInt();
        System.out.println("Quantas broas foram vendidas hoje? ");
        broa = sc.nextInt();
        valor = pao * 0.12;
        valor = valor + (broa * 1.5);
        poupanca = valor * 0.1;
        System.out.println("------------------------");
        System.out.println("Total arrecadado: R$" + valor);
        System.out.println("10% a ser guardados na Poupança: R$" + poupanca);
        valor -= poupanca;
        System.out.println("Novo total descontado: R$" + valor);
        // 6,60 + 90 - 55 60

    }

}
