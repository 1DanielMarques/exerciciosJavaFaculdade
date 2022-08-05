package ex09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int p, m, g, valorP, valorM, valorG, valorTotal;
        valorP = 10;
        valorM = 12;
        valorG = 15;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe respectivamente a quantidade");
        System.out.println("de camisetas P | M | G: ");
        p = sc.nextInt();
        m = sc.nextInt();
        g = sc.nextInt();

        valorTotal = (p * valorP) + (m * valorM) + (g * valorG);
        System.out.println("Valor arrecadado: R$" + valorTotal);

    }

}
