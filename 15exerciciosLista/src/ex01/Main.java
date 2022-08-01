package ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        float L1, L2;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe abaixo os 2 lados do terreno: ");
        L1 = sc.nextFloat();
        L2 = sc.nextFloat();
        System.out.println("Calculando área...");
        Thread.sleep(300);
        area = L1 * L2;
        System.out.println("Área do Terreno: " + area + "m²");

    }

}
